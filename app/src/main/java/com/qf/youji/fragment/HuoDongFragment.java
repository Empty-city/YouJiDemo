package com.qf.youji.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.qf.youji.R;
import com.qf.youji.eneity.DataBean;
import com.qf.youji.eneity.HuoDong;

import it.sephiroth.android.library.picasso.Picasso;

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
    private DataBean db;//类的对象

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentActivity activity = getActivity();

        db = new DataBean();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_huodong_fragment, container, false);

        //从view中获得子控件
        iv_big_id = (ImageView) view.findViewById(R.id.iv_big_id);
        tv_time_id = (TextView) view.findViewById(R.id.tv_time_id);
        tv_price_id = (TextView) view.findViewById(R.id.tv_price_id);
        tv_title_id = (TextView) view.findViewById(R.id.tv_title_id);
        tv_address_id = (TextView) view.findViewById(R.id.tv_address_id);
        tv_people_count_id = (TextView) view.findViewById(R.id.tv_people_count_id);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //设置图片
        Picasso.with(getContext()).load(db.getFace().toString()).into(iv_big_id);

        //设置时间
        tv_time_id.setText(db.getShow_time());
        //设置价格
        tv_price_id.setText(db.getPrice());
        //设置标题
        tv_title_id.setText(db.getTitle());
        //设地址
        tv_address_id.setText(db.getShow_tip());

        //设置报名人数
        tv_people_count_id.setText(db.getConfirm_user_count());

    }
}
