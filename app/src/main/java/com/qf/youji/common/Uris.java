package com.qf.youji.common;

/**
 * Created by Administrator on 2016/7/6.
 */
public class Uris {

    // 基本URI
    public static final String BASE_URI = "http://r.inews.qq.com/";
    // 视频URI
    public static final StringBuffer TAG_VEDIO_NEWS = new StringBuffer(BASE_URI)
            .append("getQQNewsUnreadList?last_id=&forward=2&mid=a4f806da2fafa2454af6b73632d63183de70ad55&devid=99000535591806&qqnetwork=wifi&last_time="+System.currentTimeMillis()/1000+"&kankaninfo=%7B%22refresh%22%3A1%2C%22gender%22%3A1%7D&apptype=android&hw=Xiaomi_MI3C&appver=23_android_5.0.0&screen_width=1080&user_chlid=news_news_finance%2Cnews_news_ent%2Cnews_news_sports%2Cnews_news_tech%2Cnews_news_ssh%2Cnews_news_mil%2Cnews_news_lad&page=0&imsi=460030966430814&mac=64%253A09%253A80%253AF7%253AF9%253A81&store=826&screen_height=1920&Cookie=%20lskey%3D%3B%20luin%3D%3B%20skey%3D%3B%20uin%3D%3B%20logintype%3D0%20&chlid=news_video_top&uid=86e96dd47cae7f64&rendType=kankan&qn-sig=63ae07c79f6bdaa6093f177e2eef18d2&qn-rid=557082007");
// 图片URI
    public static final StringBuffer ADV_URI = new StringBuffer(BASE_URI)
    .append("getFullScreenPicAndroid?mid=a4f806da2fafa2454af6b73632d63183de70ad55&devid=99000535591806&mac=64%253A09%253A80%253AF7%253AF9%253A81&qqnetwork=wifi&store=826&screen_height=1920&Cookie=%20lskey%3D%3B%20luin%3D%3B%20skey%3D%3B%20uin%3D%3B%20logintype%3D0%20&apptype=android&hw=Xiaomi_MI3C&appver=23_android_5.0.0&uid=86e96dd47cae7f64&screen_width=1080&qn-sig=378ab6266bc7070040d8e27b0e391fc1&qn-rid=1155216174&imsi=460030966430814");

}
