package com.ocean.dailyarticlesdemo.model;

/**
 * Created by ocean on 2018/8/11
 * Author :  ocean
 * Email  :  348686686@qq.com
 */
public class OneArticleModel {

    /**
     * ResultCode : 1
     * ErrCode : OK
     * Body : {"id":4861,"vol":"VOL.2135","img_url":"http://image.wufazhuce.com/FhUGpJBjkcod8DHH7OSieT-8ODKz","img_author":"Ethan Yang","img_kind":"摄影","date":"2018-08-11 06:00:00","url":"http://m.wufazhuce.com/one/2165","word":"自己被伤害的时候，有的人生气，有的人伤心。生气的人是憎恨的，将自己束之高阁而去攻击对方，歇斯底里地喊叫起来。懂得悲伤的人，一定懂得爱，只是静静地如时间停滞般，独自哀伤。人们总说爱恨参半，其实这是不可能存在的，既爱之，何恨之。","word_from":"《高岭之花》","word_id":2165}
     */

    private int ResultCode;
    private String ErrCode;
    private BodyBean Body;

    public int getResultCode() {
        return ResultCode;
    }

    public void setResultCode(int ResultCode) {
        this.ResultCode = ResultCode;
    }

    public String getErrCode() {
        return ErrCode;
    }

    public void setErrCode(String ErrCode) {
        this.ErrCode = ErrCode;
    }

    public BodyBean getBody() {
        return Body;
    }

    public void setBody(BodyBean Body) {
        this.Body = Body;
    }

    @Override
    public String toString() {
        return "OneArticleModel{" +
                "ResultCode=" + ResultCode +
                ", ErrCode='" + ErrCode + '\'' +
                ", Body=" + Body +
                '}';
    }

    public static class BodyBean {
        /**
         * id : 4861
         * vol : VOL.2135
         * img_url : http://image.wufazhuce.com/FhUGpJBjkcod8DHH7OSieT-8ODKz
         * img_author : Ethan Yang
         * img_kind : 摄影
         * date : 2018-08-11 06:00:00
         * url : http://m.wufazhuce.com/one/2165
         * word : 自己被伤害的时候，有的人生气，有的人伤心。生气的人是憎恨的，将自己束之高阁而去攻击对方，歇斯底里地喊叫起来。懂得悲伤的人，一定懂得爱，只是静静地如时间停滞般，独自哀伤。人们总说爱恨参半，其实这是不可能存在的，既爱之，何恨之。
         * word_from : 《高岭之花》
         * word_id : 2165
         */

        private int id;
        private String vol;
        private String img_url;
        private String img_author;
        private String img_kind;
        private String date;
        private String url;
        private String word;
        private String word_from;
        private int word_id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getVol() {
            return vol;
        }

        public void setVol(String vol) {
            this.vol = vol;
        }

        public String getImg_url() {
            return img_url;
        }

        public void setImg_url(String img_url) {
            this.img_url = img_url;
        }

        public String getImg_author() {
            return img_author;
        }

        public void setImg_author(String img_author) {
            this.img_author = img_author;
        }

        public String getImg_kind() {
            return img_kind;
        }

        public void setImg_kind(String img_kind) {
            this.img_kind = img_kind;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public String getWord_from() {
            return word_from;
        }

        public void setWord_from(String word_from) {
            this.word_from = word_from;
        }

        public int getWord_id() {
            return word_id;
        }

        public void setWord_id(int word_id) {
            this.word_id = word_id;
        }

        @Override
        public String toString() {
            return "BodyBean{" +
                    "id=" + id +
                    ", vol='" + vol + '\'' +
                    ", img_url='" + img_url + '\'' +
                    ", img_author='" + img_author + '\'' +
                    ", img_kind='" + img_kind + '\'' +
                    ", date='" + date + '\'' +
                    ", url='" + url + '\'' +
                    ", word='" + word + '\'' +
                    ", word_from='" + word_from + '\'' +
                    ", word_id=" + word_id +
                    '}';
        }
    }
}
