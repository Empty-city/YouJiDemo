package com.qf.youji.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.qf.youji.R;
import com.qf.youji.Utils.HttpUtil;
import com.qf.youji.common.Uris;
import com.qf.youji.eneity.DataBean;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/7.
 */
public class HuoDongFragment extends android.support.v4.app.Fragment {
    private ImageView iv_big_id;//图片
    private TextView tv_time_id;//时间
    private TextView tv_price_id;//价格
    private TextView tv_title_id;//标题
    private TextView tv_address_id;//地址
    private TextView tv_people_count_id;//报名人数
//    private DataBean db;//类的对象
    private FragmentActivity activity;
    private ListView lv_id;//ListView
    private List<Map<String, Object>> dataResource;
//    private MyBaseAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = getActivity();


//        db = new DataBean();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_huodong_fragment, container, false);

        //从view中获得子控件
        lv_id = (ListView) view.findViewById(R.id.lv_id);

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
        //填充数据源
        fillDataResource(dataResource);
        //适配器
        SimpleAdapter adapter = new SimpleAdapter(getContext(),dataResource,R.layout.layout_huodong_item,
                new String[]{"iv_big_id","tv_time_id","tv_price_id","tv_title_id","tv_address_id","tv_people_count_id"},
                new int[]{R.id.iv_big_id,R.id.tv_time_id,R.id.tv_price_id,R.id.tv_title_id,R.id.tv_people_count_id});
//        adapter = new MyBaseAdapter(getContext(), dataResource);
        //绑定适配器
        lv_id.setAdapter(adapter);
    }

    /**
     * 填充数据源
     * @param datas
     */
    private void fillDataResource(List<Map<String, Object>> datas) {

        //调用下载和解析方法，并返回DataBean集合
        List<DataBean> dataBeen = HttpUtil.downLoadDataFromNet("http://e-traveltech.com/api/operate/getActivities?type=1&sn=0&nu=10&fund_support=0&device_id=aimei865290020503687&plat=aphone&os_version=4.4.4&version=3.2.1&dev_model=U3&net_type=WIFI&language=1&app=3&channel_id=1110101&invitation_code=&t=1467855882&user_id=145224&s=5725bef37119b7b9d9a74d215d93bf56");
        for(DataBean db : dataBeen){
            Map<String, Object> map = new LinkedHashMap<>();
            map.put("iv_big_id",db.getFace());
            map.put("tv_time_id",db.getShow_time());
            map.put("tv_price_id",db.getPrice());
            map.put("tv_title_id",db.getTitle());
            map.put("tv_address_id",db.getShow_tip());
            map.put("tv_people_count_id",db.getConfirm_user_count());

            datas.add(map);
        }
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
