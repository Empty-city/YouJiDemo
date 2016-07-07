package com.qf.youji.eneity;

/**
 * 游迹模块之图片实体类
 * Created by Administrator on 2016/7/6.
 */
public class PictureYouJi {

    /**
     * agree_nr : 18
     * browse_nr : 459
     * comment_nr : 0
     * comment_type : 1
     * comments : []
     * ctime : 1467705403
     * disagree_nr : 0
     * face : http://static.e-traveltech.com/image/a4/42/a442b661be3eb9334ddd9840ed3acef9.jpg
     * format_ctime : 23小时前
     * from : 0
     * id : 32621
     * is_agree : 0
     * label :
     * max_browser_nr : 2565
     * open_type : 1
     * share_url : http://e-traveltech.com/travelNotes/page/index?travel_id=32621
     * show_footer : 1
     * sub_title :
     * sub_type : 1
     * title : 美丽心情
     * type : 2
     * url : http://e-traveltech.com/travelNotes/page/index?travel_id=32621
     * user : {"app":"3","area_id":"0","binding_id":"0","city_id":"0","country_id":"0","ctime":"1433314741","description":"","email":"","gender":"2","hobby":"","id":"2508","identity":"","latitude":"0","level":"0","login":"DCC7BD5BC10CAC0EAE0B1059C08F63A9_1433314741","logo":"http://q.qlogo.cn/qqapp/1104234620/DCC7BD5BC10CAC0EAE0B1059C08F63A9/100","longitude":"0","name":"一棵树","nick":"一棵树","profession_id":"0","province_id":"0","remark":"","score":"65","status":"0","telphone":"","travel_fund":"0","type":"2","wealth":"0","wechat_id":""}
     * user_id : 2508
     * video :
     * video_play_type : 0
     * video_size : 0
     */

    private String agree_nr;
    private String browse_nr;
    private int comment_nr;
    private String face;
    private String format_ctime;
    private String share_url;
    private String title;
    private String url;
    /**
     * app : 3
     * area_id : 0
     * binding_id : 0
     * city_id : 0
     * country_id : 0
     * ctime : 1433314741
     * description :
     * email :
     * gender : 2
     * hobby :
     * id : 2508
     * identity :
     * latitude : 0
     * level : 0
     * login : DCC7BD5BC10CAC0EAE0B1059C08F63A9_1433314741
     * logo : http://q.qlogo.cn/qqapp/1104234620/DCC7BD5BC10CAC0EAE0B1059C08F63A9/100
     * longitude : 0
     * name : 一棵树
     * nick : 一棵树
     * profession_id : 0
     * province_id : 0
     * remark :
     * score : 65
     * status : 0
     * telphone :
     * travel_fund : 0
     * type : 2
     * wealth : 0
     * wechat_id :
     */

    private UserBean user;

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

    public int getComment_nr() {
        return comment_nr;
    }

    public void setComment_nr(int comment_nr) {
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

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public static class UserBean {
        private String login;
        private String logo;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }
    }
}
