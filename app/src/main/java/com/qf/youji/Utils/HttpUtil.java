package com.qf.youji.Utils;

import android.widget.Toast;

import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;

/**
 * 下载网络数据
 * Created by Administrator on 2016-07-06.
 */
public class HttpUtil {

    private void downLoadDataFromNet(String uriStr) {

        HttpUtils client = new HttpUtils();

        //发送get请求
        client.send(HttpRequest.HttpMethod.GET, uriStr, new RequestCallBack<byte[]>() {
            @Override
            public void onSuccess(ResponseInfo<byte[]> responseInfo) {

                byte[] result = responseInfo.result;
//                ParseJSONUtils.parseJSON(result.toString(),);


            }

            @Override
            public void onFailure(HttpException error, String msg) {
            }
        });


    }
}
