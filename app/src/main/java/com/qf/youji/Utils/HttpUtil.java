package com.qf.youji.Utils;

import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.HttpHandler;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;
import com.qf.youji.eneity.DataBean;

import java.util.List;

/**
 * 下载网络数据
 * Created by Administrator on 2016-07-06.
 */
public class HttpUtil {

    private static List<DataBean> dataBeen;

    public static List<DataBean> downLoadDataFromNet(String uriStr) {

        HttpUtils http = new HttpUtils();

        //发送get请求
        http.send(HttpRequest.HttpMethod.GET, uriStr, new RequestCallBack<String>() {
            @Override
            public void onSuccess(ResponseInfo<String> responseInfo) {

                String result = responseInfo.result;
                //调用解析方法进行解析
                List<DataBean> dataBeen = ParseJSONUtils.parseJSON(result);
            }


            @Override
            public void onFailure(HttpException error, String msg) {
            }
        });
        return dataBeen;
    }
}
