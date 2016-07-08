package com.qf.youji.fragment;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.qf.youji.MyApp;
import com.qf.youji.R;
import com.qf.youji.common.Uris;
import com.qf.youji.eneity.HuoDong;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.ToDoubleBiFunction;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Created by Administrator on 2016/7/7.
 */
public class HuoDongFragment extends android.support.v4.app.Fragment {
    private ImageView iv_big_id;//图片
    //    private TextView tv_time_id;//时间
//    private TextView tv_price_id;//价格
//    private TextView tv_title_id;//标题
//    private TextView tv_address_id;//地址
//    private TextView tv_people_count_id;//报名人数
    //    private DataBean db;//类的对象
    private FragmentActivity activity;
    private ListView lv_id;//ListView
    private List<Map<String, Object>> dataResource;
    private List<HuoDong.DataBean> data;
    private SimpleAdapter adapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_huodong_fragment, container, false);

        //从view中获得子控件
        lv_id = (ListView) view.findViewById(R.id.lv_id);
        iv_big_id = (ImageView) lv_id.findViewById(R.id.iv_big_id);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //关于ListView的操作
        abdoutListView();
    }

    /**
     * 关于ListView的操作
     */
    private void abdoutListView() {
        //数据源
        dataResource = new LinkedList<>();
        //适配器
        adapter = new SimpleAdapter(getContext(), dataResource, R.layout.layout_huodong_item,
                new String[]{"iv_big_id", "tv_time_id", "tv_price_id", "tv_title_id", "tv_address_id", "tv_people_count_id"},
                new int[]{R.id.iv_big_id, R.id.tv_time_id, R.id.tv_price_id, R.id.tv_title_id, R.id.tv_address_id, R.id.tv_people_count_id});
        //实时显示图片
        adapter.setViewBinder(new SimpleAdapter.ViewBinder() {
            @Override
            public boolean setViewValue(View view, Object o, String s) {
                if(view instanceof ImageView && o instanceof Bitmap){
                    ImageView iv = (ImageView) view;
                    Bitmap b = (Bitmap) o;
                    iv.setImageBitmap(b);
                    return true;
                }
                return false;
            }
        });
        //绑定适配器
        lv_id.setAdapter(adapter);
        //填充数据源
        fillDataResource();

        //添加监听器(点击跳转到详情Fragment界面）
        lv_id.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                FragmentManager fragmentManager = getFragmentManager();


            }
        });
    }
    /**
     * 填充数据源(Volley下载json数据，gson技术解析数据）
     * @param
     */
    private void fillDataResource() {
        final StringRequest request = new StringRequest(Uris.ACTIVITY_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        Log.e("respone=", response);
                        System.out.println("response=" + response);

                        Gson gson = new Gson();

                        HuoDong huoDong = gson.fromJson(response, HuoDong.class);
                        data = huoDong.getData();
                        //遍历
                        for (HuoDong.DataBean dbean : data) {
                            //加载图片
                            Map<String, Object> map = new LinkedHashMap<>();
                            //不能如此使用，不知道why
//                            Picasso.with(getContext()).load(dbean.getFace()).into(iv_big_id);
                            getBitmap(dbean.getFace(),map);
//                            Bitmap bitmap = secondMakePic(dbean.getFace(), iv_big_id.getWidth(), iv_big_id.getHeight());

                            map.put("tv_time_id", dbean.getShow_time());
                            map.put("tv_price_id", "¥" + dbean.getPrice());
                            map.put("tv_title_id", dbean.getTitle());
                            map.put("tv_address_id", dbean.getShow_tip());
                            map.put("tv_people_count_id", dbean.getConfirm_user_count() + "人报名");

                            dataResource.add(map);
                        }
                        adapter.notifyDataSetChanged();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("TAG", error.getMessage(), error);
                    }
                });
        //添加到请求队列中
        request.setTag("qx");
        MyApp.getApp().getRequestQueue().add(request);
    }
    /**
     * 根据url加载图片
     * @param path
     * @return
     */
    public final void getBitmap(final String path, final Map<String, Object> map) {
        new Thread(){
            @Override
            public void run() {
                InputStream inputStream = null;
                HttpURLConnection conn = null;
                URL url = null;
                try {
                    url = new URL(path);
                    conn = (HttpURLConnection) url.openConnection();
                    conn.setConnectTimeout(5000);
                    conn.setRequestMethod("GET");
                    if (conn.getResponseCode() == 200) {
                        inputStream = conn.getInputStream();
                        Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
//                        TODO
                        map.put("iv_big_id",bitmap);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (conn != null) {
                        conn.disconnect();
                    }
                }
            }
        }.start();
    }

    /**
     * 二次采样
     * @param urlStr
     * @param factWeight
     * @param factHeight
     * @return
     */
    public final Bitmap secondMakePic(String urlStr,int factWeight,int factHeight){

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize =1;

        BitmapFactory.decodeFile(urlStr,options);

        int weight = options.outWidth / factWeight;
        int height = options.outHeight / factHeight;

        options.inSampleSize = Math.max(weight,height);
        options.inJustDecodeBounds = true;

        Bitmap bitmap = BitmapFactory.decodeFile(urlStr, options);

        return bitmap;
    }
    //销毁
    @Override
    public void onDestroy() {
        super.onDestroy();
        MyApp.getApp().getRequestQueue().cancelAll("qx");
    }
    /**
     * 自定义SimpleAdapter类
     */
//    private class MyBaseAdapter extends BaseAdapter {
//
//
//        private Context context;
//        private List<Map<String, Object>> dataResource;
//
//        public MyBaseAdapter(Context context, List<Map<String, Object>> datas) {
//            this.context = context;
//            this.dataResource = datas;
//        }
//
//        @Override
//        public int getCount() {
//            return dataResource.size();
//        }
//
//        @Override
//        public Object getItem(int position) {
//            return dataResource.get(position);
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return position;
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//            ViewHolder holder;
//            if (convertView == null) {
//                convertView = View.inflate(getContext(), R.layout.layout_huodong_item, null);
//                holder = new ViewHolder();
//                //获得子控件
//                holder.iv_big_id = (ImageView) convertView.findViewById(R.id.iv_big_id);
//                holder.tv_time_id = (TextView) convertView.findViewById(R.id.tv_time_id);
//                holder.tv_price_id = (TextView) convertView.findViewById(R.id.tv_price_id);
//                holder.tv_title_id = (TextView) convertView.findViewById(R.id.tv_title_id);
//                holder.tv_address_id = (TextView) convertView.findViewById(R.id.tv_address_id);
//                holder.tv_people_count_id = (TextView) convertView.findViewById(R.id.tv_people_count_id);
//                //绑定ViewHolderd对象
//                convertView.setTag(holder);
//            } else {
//                //取出ViewHolder的对象
//                holder = (ViewHolder) convertView.getTag();
//            }
//
//            //设置每个子控件上的值
//            //设置图片
//            Picasso.with(getContext()).load(db.getFace().toString()).into(holder.iv_big_id);
//            //设置时间
//            holder.tv_time_id.setText(db.getShow_time());
//            //设置价格
//            holder.tv_price_id.setText(db.getPrice());
//            //设置标题
//            holder.tv_title_id.setText(db.getTitle());
//            //设地址
//            holder.tv_address_id.setText(db.getShow_tip());
//            //设置报名人数
//            holder.tv_people_count_id.setText(db.getConfirm_user_count());
//
////            此处为每个子控件添加监听器，点击之后跳到详情界面
//
//            return convertView;
//        }
//    }
//
//    /**
//     * 自定义ViewHolder类
//     */
//    private final class ViewHolder {
//        private ImageView iv_big_id;//图片
//        private TextView tv_time_id;//时间
//        private TextView tv_price_id;//价格
//        private TextView tv_title_id;//标题
//        private TextView tv_address_id;//地址
//        private TextView tv_people_count_id;//报名人数
//    }
}
