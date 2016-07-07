package com.qf.youji.eneity;

import java.util.List;

/**
 * Created by Administrator on 2016-07-06.
 */
public class HuoDong {


    /**
     * error_code : 0
     * count : 3
     * data : [{"id":"77","origi_site":"","confirm_user_count":"4","has_bonus":"0","title":"想开飞机？随时体验！","description":"","face":"http://static.e-traveltech.com/image/bf/d3/bfd376ea32806211d0557fcb490a3b41.jpg","time":"1468684800","show_time":"2016.07.17","show_tip":"","price":"1800.00","preferential":"0","detail_url":"http://iwetuan.com/app/travel_detail?id=77","share_url":"http://iwetuan.com/app/travel_detail?id=77","type":4,"comment_type":0,"tag_logo":"","type_ids":"2,0","types":[{"id":"2","name":"徒步"}]},{"id":"62","origi_site":"","confirm_user_count":"11","has_bonus":"1","title":"向往神山\u2014\u2014走向贡嘎雪山（摄影/徒步）","description":"","face":"http://static.e-traveltech.com/image/c8/cf/c8cf13ba10fe3ce6a956df58f63726ac.jpg","time":"1469980800","show_time":"2016.08.01","show_tip":"康定，新都桥，贡嘎山乡，茨梅垭口","price":"5980.00","preferential":"0","detail_url":"http://iwetuan.com/app/travel_detail?id=62","share_url":"http://iwetuan.com/app/travel_detail?id=62","type":4,"comment_type":0,"tag_logo":"","type_ids":"","types":[]},{"id":"124","origi_site":"","confirm_user_count":"1","has_bonus":"0","title":"大师教你如何做精致花艺","description":"","face":"http://static.e-traveltech.com/image/02/99/0299c8b69cce446cb6125eca5c8c4604.jpg","time":"1468080000","show_time":"2016.07.10","show_tip":"北京","price":"18000.00","preferential":"0","detail_url":"http://iwetuan.com/app/travel_detail?id=124","share_url":"http://iwetuan.com/app/travel_detail?id=124","type":4,"comment_type":0,"tag_logo":"","type_ids":"","types":[]}]
     * error_msg : Ok!
     */

    private int error_code;
    private int count;
    private String error_msg;
    /**
     * id : 77
     * origi_site :
     * confirm_user_count : 4
     * has_bonus : 0
     * title : 想开飞机？随时体验！
     * description :
     * face : http://static.e-traveltech.com/image/bf/d3/bfd376ea32806211d0557fcb490a3b41.jpg
     * time : 1468684800
     * show_time : 2016.07.17
     * show_tip :
     * price : 1800.00
     * preferential : 0
     * detail_url : http://iwetuan.com/app/travel_detail?id=77
     * share_url : http://iwetuan.com/app/travel_detail?id=77
     * type : 4
     * comment_type : 0
     * tag_logo :
     * type_ids : 2,0
     * types : [{"id":"2","name":"徒步"}]
     */

    private List<DataBean> data;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String id;
        private String origi_site;
        private String confirm_user_count;
        private String has_bonus;
        private String title;
        private String description;
        private String face;
        private String time;
        private String show_time;
        private String show_tip;
        private String price;
        private String preferential;
        private String detail_url;
        private String share_url;
        private int type;
        private int comment_type;
        private String tag_logo;
        private String type_ids;
        /**
         * id : 2
         * name : 徒步
         */

        private List<TypesBean> types;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getOrigi_site() {
            return origi_site;
        }

        public void setOrigi_site(String origi_site) {
            this.origi_site = origi_site;
        }

        public String getConfirm_user_count() {
            return confirm_user_count;
        }

        public void setConfirm_user_count(String confirm_user_count) {
            this.confirm_user_count = confirm_user_count;
        }

        public String getHas_bonus() {
            return has_bonus;
        }

        public void setHas_bonus(String has_bonus) {
            this.has_bonus = has_bonus;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getFace() {
            return face;
        }

        public void setFace(String face) {
            this.face = face;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
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

        public String getPreferential() {
            return preferential;
        }

        public void setPreferential(String preferential) {
            this.preferential = preferential;
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

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getComment_type() {
            return comment_type;
        }

        public void setComment_type(int comment_type) {
            this.comment_type = comment_type;
        }

        public String getTag_logo() {
            return tag_logo;
        }

        public void setTag_logo(String tag_logo) {
            this.tag_logo = tag_logo;
        }

        public String getType_ids() {
            return type_ids;
        }

        public void setType_ids(String type_ids) {
            this.type_ids = type_ids;
        }

        public List<TypesBean> getTypes() {
            return types;
        }

        public void setTypes(List<TypesBean> types) {
            this.types = types;
        }

        public static class TypesBean {
            private String id;
            private String name;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
