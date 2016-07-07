package com.qf.youji.eneity;

/**
 * Created by Administrator on 2016-07-06.
 */
public class DataBean {
    private String confirm_user_count;//报名人数
    private String title;//标题
    private String face;//图片链接
    private String show_time;//时间
    private String show_tip;//地点
    private String price;//价格
    private String detail_url;//详情链接
    private String share_url;//分享链接


    public DataBean() {
    }

    public DataBean(String share_url, String confirm_user_count, String title, String face, String show_time, String show_tip, String price, String detail_url) {
        this.share_url = share_url;
        this.confirm_user_count = confirm_user_count;
        this.title = title;
        this.face = face;
        this.show_time = show_time;
        this.show_tip = show_tip;
        this.price = price;
        this.detail_url = detail_url;
    }

    public String getConfirm_user_count() {
        return confirm_user_count;
    }

    public void setConfirm_user_count(String confirm_user_count) {
        this.confirm_user_count = confirm_user_count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getShow_time() {
        return show_time;
    }

    public void setShow_time(String show_time) {
        this.show_time = show_time;
    }

    public String getShow_tip() {
        return show_tip;
    }

    public void setShow_tip(String show_tip) {
        this.show_tip = show_tip;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDetail_url() {
        return detail_url;
    }

    public void setDetail_url(String detail_url) {
        this.detail_url = detail_url;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }
}
