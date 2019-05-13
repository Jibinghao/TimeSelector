package com.jibinghao.ztlibrary.entity;

/**
 * FileName: MonthBean
 * Author: jibinghao
 * Date: 2019/5/13 10:22 AM
 * Email:heybinghao@gmail.com
 * Description:
 */

public class MonthBean {

    String content;//格式化好的
    String month;
    String day;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public MonthBean(String content, String month, String day) {
        this.content = content;
        this.month = month;
        this.day = day;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
