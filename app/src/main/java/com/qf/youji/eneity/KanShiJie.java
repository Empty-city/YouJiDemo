package com.qf.youji.eneity;

import java.util.List;

/**
 * Created by Administrator on 2016-07-06.
 */
public class KanShiJie {

    /**
     * id : 544
     * app : 3
     * title : 世界奇闻
     * template : 1
     * index : 1
     * more : 1
     * articles : [{"id":"1718","app":"3","type":1,"sub_type":"1","spots_type":"1","spots_id":"0","child_spots_id":"0","title":"大洋底下真的生活着另一种人类吗","short_title":"神秘的大西洋底的神奇人类","audio_title":"","face":"http://static.e-traveltech.com/image/62/4e/624ee5373f691b9d766ee30f93a7a2dc.jpg","video":"","face2":"http://static.e-traveltech.com/image/ee/ac/eeacdbf84b1a851aa37e5d377f719aa0.jpg","description":"在神秘莫测的大西洋底，生活着一种奇特的人类，他们修建了金碧辉煌的海底城市，创造了辉煌的历史，无忧无虑地和海底的生物一起生活着。","address":"","country_id":"0","province_id":"0","city_id":"0","place_id":"0","agree_nr":"0","disagree_nr":"0","comment_nr":"6","browse_nr":"1192","plus_agree_nr":"0","plus_disagree_nr":"0","plus_comment_nr":"0","plus_browse_nr":"0","index":"0","tag":"每日一问","relative":[],"audio":"","open_type":1,"show_footer":1,"comment_type":2,"url":"http://m.e-traveltech.com//world/index/world?travel_id=1718&app=3","share_url":"http://m.e-traveltech.com//world/index/world?travel_id=1718&app=3"}]
     */

    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String id;
        private String app;
        private String title;
        private String template;
        private String index;
        private String more;
        /**
         * id : 1718
         * app : 3
         * type : 1
         * sub_type : 1
         * spots_type : 1
         * spots_id : 0
         * child_spots_id : 0
         * title : 大洋底下真的生活着另一种人类吗
         * short_title : 神秘的大西洋底的神奇人类
         * audio_title :
         * face : http://static.e-traveltech.com/image/62/4e/624ee5373f691b9d766ee30f93a7a2dc.jpg
         * video :
         * face2 : http://static.e-traveltech.com/image/ee/ac/eeacdbf84b1a851aa37e5d377f719aa0.jpg
         * description : 在神秘莫测的大西洋底，生活着一种奇特的人类，他们修建了金碧辉煌的海底城市，创造了辉煌的历史，无忧无虑地和海底的生物一起生活着。
         * address :
         * country_id : 0
         * province_id : 0
         * city_id : 0
         * place_id : 0
         * agree_nr : 0
         * disagree_nr : 0
         * comment_nr : 6
         * browse_nr : 1192
         * plus_agree_nr : 0
         * plus_disagree_nr : 0
         * plus_comment_nr : 0
         * plus_browse_nr : 0
         * index : 0
         * tag : 每日一问
         * relative : []
         * audio :
         * open_type : 1
         * show_footer : 1
         * comment_type : 2
         * url : http://m.e-traveltech.com//world/index/world?travel_id=1718&app=3
         * share_url : http://m.e-traveltech.com//world/index/world?travel_id=1718&app=3
         */

        private List<ArticlesBean> articles;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getApp() {
            return app;
        }

        public void setApp(String app) {
            this.app = app;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTemplate() {
            return template;
        }

        public void setTemplate(String template) {
            this.template = template;
        }

        public String getIndex() {
            return index;
        }

        public void setIndex(String index) {
            this.index = index;
        }

        public String getMore() {
            return more;
        }

        public void setMore(String more) {
            this.more = more;
        }

        public List<ArticlesBean> getArticles() {
            return articles;
        }

        public void setArticles(List<ArticlesBean> articles) {
            this.articles = articles;
        }

        public static class ArticlesBean {
            private String id;
            private String app;
            private int type;
            private String sub_type;
            private String spots_type;
            private String spots_id;
            private String child_spots_id;
            private String title;
            private String short_title;
            private String audio_title;
            private String face;
            private String video;
            private String face2;
            private String description;
            private String address;
            private String country_id;
            private String province_id;
            private String city_id;
            private String place_id;
            private String agree_nr;
            private String disagree_nr;
            private String comment_nr;
            private String browse_nr;
            private String plus_agree_nr;
            private String plus_disagree_nr;
            private String plus_comment_nr;
            private String plus_browse_nr;
            private String index;
            private String tag;
            private String audio;
            private int open_type;
            private int show_footer;
            private int comment_type;
            private String url;
            private String share_url;
            private List<?> relative;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getApp() {
                return app;
            }

            public void setApp(String app) {
                this.app = app;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getSub_type() {
                return sub_type;
            }

            public void setSub_type(String sub_type) {
                this.sub_type = sub_type;
            }

            public String getSpots_type() {
                return spots_type;
            }

            public void setSpots_type(String spots_type) {
                this.spots_type = spots_type;
            }

            public String getSpots_id() {
                return spots_id;
            }

            public void setSpots_id(String spots_id) {
                this.spots_id = spots_id;
            }

            public String getChild_spots_id() {
                return child_spots_id;
            }

            public void setChild_spots_id(String child_spots_id) {
                this.child_spots_id = child_spots_id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getShort_title() {
                return short_title;
            }

            public void setShort_title(String short_title) {
                this.short_title = short_title;
            }

            public String getAudio_title() {
                return audio_title;
            }

            public void setAudio_title(String audio_title) {
                this.audio_title = audio_title;
            }

            public String getFace() {
                return face;
            }

            public void setFace(String face) {
                this.face = face;
            }

            public String getVideo() {
                return video;
            }

            public void setVideo(String video) {
                this.video = video;
            }

            public String getFace2() {
                return face2;
            }

            public void setFace2(String face2) {
                this.face2 = face2;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getCountry_id() {
                return country_id;
            }

            public void setCountry_id(String country_id) {
                this.country_id = country_id;
            }

            public String getProvince_id() {
                return province_id;
            }

            public void setProvince_id(String province_id) {
                this.province_id = province_id;
            }

            public String getCity_id() {
                return city_id;
            }

            public void setCity_id(String city_id) {
                this.city_id = city_id;
            }

            public String getPlace_id() {
                return place_id;
            }

            public void setPlace_id(String place_id) {
                this.place_id = place_id;
            }

            public String getAgree_nr() {
                return agree_nr;
            }

            public void setAgree_nr(String agree_nr) {
                this.agree_nr = agree_nr;
            }

            public String getDisagree_nr() {
                return disagree_nr;
            }

            public void setDisagree_nr(String disagree_nr) {
                this.disagree_nr = disagree_nr;
            }

            public String getComment_nr() {
                return comment_nr;
            }

            public void setComment_nr(String comment_nr) {
                this.comment_nr = comment_nr;
            }

            public String getBrowse_nr() {
                return browse_nr;
            }

            public void setBrowse_nr(String browse_nr) {
                this.browse_nr = browse_nr;
            }

            public String getPlus_agree_nr() {
                return plus_agree_nr;
            }

            public void setPlus_agree_nr(String plus_agree_nr) {
                this.plus_agree_nr = plus_agree_nr;
            }

            public String getPlus_disagree_nr() {
                return plus_disagree_nr;
            }

            public void setPlus_disagree_nr(String plus_disagree_nr) {
                this.plus_disagree_nr = plus_disagree_nr;
            }

            public String getPlus_comment_nr() {
                return plus_comment_nr;
            }

            public void setPlus_comment_nr(String plus_comment_nr) {
                this.plus_comment_nr = plus_comment_nr;
            }

            public String getPlus_browse_nr() {
                return plus_browse_nr;
            }

            public void setPlus_browse_nr(String plus_browse_nr) {
                this.plus_browse_nr = plus_browse_nr;
            }

            public String getIndex() {
                return index;
            }

            public void setIndex(String index) {
                this.index = index;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getAudio() {
                return audio;
            }

            public void setAudio(String audio) {
                this.audio = audio;
            }

            public int getOpen_type() {
                return open_type;
            }

            public void setOpen_type(int open_type) {
                this.open_type = open_type;
            }

            public int getShow_footer() {
                return show_footer;
            }

            public void setShow_footer(int show_footer) {
                this.show_footer = show_footer;
            }

            public int getComment_type() {
                return comment_type;
            }

            public void setComment_type(int comment_type) {
                this.comment_type = comment_type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getShare_url() {
                return share_url;
            }

            public void setShare_url(String share_url) {
                this.share_url = share_url;
            }

            public List<?> getRelative() {
                return relative;
            }

            public void setRelative(List<?> relative) {
                this.relative = relative;
            }
        }
    }
}
