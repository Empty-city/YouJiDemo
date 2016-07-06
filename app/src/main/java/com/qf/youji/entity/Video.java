package com.qf.youji.entity;

import java.util.List;

/**
 * 游迹视频实体类
 * Created by Administrator on 2016/7/6.
 */
public class Video {

    /**
     * agree_nr : 0
     * browse_nr : 2
     * comment_nr : 1
     * comment_type : 1
     * comments : [{"content":"赞","target_id":"32805","user_id":"0","user_logo":"http://e-traveltech.com/logo/logo.png"}]
     * ctime : 1467705655
     * disagree_nr : 0
     * face : http://static.e-traveltech.com/image/c4/8b/c48b176c0425d7431eec810d8b25ad93.jpg
     * format_ctime : 23小时前
     * from : 0
     * id : 32805
     * is_agree : 0
     * label : 蹦极
     * max_browser_nr : 0
     * open_type : 1
     * share_url : http://m.e-traveltech.com//travelnote/index/video?travel_id=32805
     * show_footer : 1
     * sub_title : 美国
     * sub_type : 2
     * title : 极限运动-GLORY惠斯勒速降 AM，超帅的技术，很流畅
     * type : 2
     * url : http://e-traveltech.com/travelNotes/page/index?travel_id=32805
     * user : {"app":"3","area_id":"0","binding_id":"0","city_id":"0","country_id":"0","ctime":"1445964130","description":"","email":"","gender":"0","hobby":"","id":"7597","identity":"","latitude":"0","level":"0","login":"女人，活出自己的骄傲来","logo":"http://115.29.179.17:8100/image/f5/dd/f5dd9dcc082c6e2334422ba33a505cfb.jpg","longitude":"0","name":"女人，活出自己的骄傲来","nick":"女人，活出自己的骄傲来","profession_id":"0","province_id":"0","remark":"","score":"0","status":"0","telphone":"","travel_fund":"0","type":"6","wealth":"0","wechat_id":""}
     * user_id : 7597
     * video : http://video.e-traveltech.com/wonder/huisile.mp4
     * video_play_type : 2
     * video_size : 0
     */

    private String agree_nr;
    private String browse_nr;
    private String comment_nr;
    private String face;
    private String format_ctime;
    private String share_url;
    private String sub_title;
    private String title;
    private String url;
    private String video;
    /**
     * content : 赞
     * target_id : 32805
     * user_id : 0
     * user_logo : http://e-traveltech.com/logo/logo.png
     */

    private List<CommentsBean> comments;

    public String getAgree_nr() {
        return agree_nr;
    }

    public void setAgree_nr(String agree_nr) {
        this.agree_nr = agree_nr;
    }

    public String getBrowse_nr() {
        return browse_nr;
    }

    public void setBrowse_nr(String browse_nr) {
        this.browse_nr = browse_nr;
    }

    public String getComment_nr() {
        return comment_nr;
    }

    public void setComment_nr(String comment_nr) {
        this.comment_nr = comment_nr;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getFormat_ctime() {
        return format_ctime;
    }

    public void setFormat_ctime(String format_ctime) {
        this.format_ctime = format_ctime;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public String getSub_title() {
        return sub_title;
    }

    public void setSub_title(String sub_title) {
        this.sub_title = sub_title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public List<CommentsBean> getComments() {
        return comments;
    }

    public void setComments(List<CommentsBean> comments) {
        this.comments = comments;
    }

    public static class CommentsBean {
        private String content;
        private String user_logo;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getUser_logo() {
            return user_logo;
        }

        public void setUser_logo(String user_logo) {
            this.user_logo = user_logo;
        }
    }
}
