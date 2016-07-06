package com.qf.youji.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.qf.youji.R;
import com.qf.youji.eneity.HuoDong;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * 活动选项对应的Fragment
 */

public class Fragment_HuoDong extends Fragment {

    private ImageView iv_big_id;//图片
    private TextView tv_time_id;//时间
    private TextView tv_price_id;//价格
    private TextView tv_title_id;//标题
    private TextView tv_fu_title_id;//副标题
    private TextView tv_add_id;//地址
    private TextView tv_people_count_id;//报名人数
    private HuoDong hd;//活动类的实例
    private HuoDong.DataBean db;//静态内部类

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        hd = new HuoDong();

        db = new HuoDong.DataBean();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_huodong_fragment, container, false);

        iv_big_id = (ImageView) view.findViewById(R.id.iv_big_id);
        tv_time_id = (TextView) view.findViewById(R.id.tv_time_id);
        tv_price_id = (TextView) view.findViewById(R.id.tv_price_id);
        tv_title_id = (TextView) view.findViewById(R.id.tv_title_id);
        tv_fu_title_id = (TextView) view.findViewById(R.id.tv_fu_title_id);
        tv_add_id = (TextView) view.findViewById(R.id.tv_add_id);
        tv_people_count_id = (TextView) view.findViewById(R.id.tv_people_count_id);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //设置图片
        Picasso.with(getContext()).load(db.getFace()).into(iv_big_id);

        //设置时间
        tv_time_id.setText(db.getShow_time());
        //设置价格
        tv_price_id.setText(db.getPrice());
        //设置标题
        tv_title_id.setText(db.getTitle());
        //设置副标题
        tv_fu_title_id.setText(db.getDescription());
        //设置地址
        // tv_add_id.setText(db.get);
        //设置报名人数
        tv_people_count_id.setText(db.getConfirm_user_count());

    }
}
