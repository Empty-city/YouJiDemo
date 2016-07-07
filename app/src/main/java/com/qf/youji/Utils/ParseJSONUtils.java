package com.qf.youji.Utils;

import com.qf.youji.eneity.DataBean;
import com.qf.youji.eneity.HuoDong;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.LinkedList;
import java.util.List;

/**
 * json数据解析类
 * Created by Administrator on 2016-07-06.
 */
public class ParseJSONUtils {

    private static LinkedList<DataBean> dataBeen;
    List<DataBean> datas;
    /**
     * 解析
     */
    public static List<DataBean> parseJSON(String jsonStr) {
        try {
            JSONObject obj = new JSONObject(jsonStr);
            JSONArray jsonArray = obj.getJSONArray("data");
            //遍历每一个对象并存入data集合
            dataBeen = new LinkedList<>();
            List<DataBean> datas = dataBeen;
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject object = (JSONObject) jsonArray.get(i);
                //获得每一个对象的所有属性信息
                String face = object.getString("face");
                String show_time = object.getString("show_time");
                String price = object.getString("price");
                String title = object.getString("title");
                String show_tip = object.getString("show_tip");
                String confirm_user_count = object.getString("confirm_user_count");
                String detail_url = object.getString("detail_url");
                String share_url = object.getString("share_url");

                //根据属性构建每一个对象
                DataBean db = new DataBean(face, show_time, price, title, show_tip, confirm_user_count, detail_url, share_url);
                //将每一个对象都添加到List集合中
                datas.add(db);
            }

            return datas;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }


}
