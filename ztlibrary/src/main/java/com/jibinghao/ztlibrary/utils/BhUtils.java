package com.jibinghao.ztlibrary.utils;

import android.annotation.SuppressLint;

import com.jibinghao.ztlibrary.entity.MonthBean;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * FileName: BhUtils
 * Author: jibinghao
 * Date: 2019/5/13 10:27 AM
 * Email:heybinghao@gmail.com
 * Description:
 */

public class BhUtils {

    public static ArrayList<MonthBean> getMontList(int year) {
        /**
         * @method name:getMontList
         * @des: 获取某一年的所有天数
         * @param :[year]
         * @return type:java.util.ArrayList<com.qmzhhchsh.yp.widget.timeWheelView.entity.MonthBean>
         * @date 创建时间:2019/4/25
         * @author jibinghao
         **/
        Calendar calendar = Calendar.getInstance();
        int yearNow = calendar.get(Calendar.YEAR);
        boolean isYear = (yearNow == year);//是否同年
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        Calendar cal = Calendar.getInstance();// 获得当前日期对象
        cal.clear();// 清除信息
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        ArrayList<MonthBean> list = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            list.addAll(getMonthFullDay(year, i, 1, isYear, cal));
        }
        return list;
    }

    /**
     * @param :[year, month, day, isYear]
     * @return type:java.util.List<java.lang.String>
     * @method name:getMonthFullDay
     * @des:某一年某个月的每一天
     * @date 创建时间:2019/4/25
     * @author jibinghao
     **/
    private static List<MonthBean> getMonthFullDay(int year, int month, int day, boolean isYear, Calendar now) {

        String[] arr = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
        SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
        List<MonthBean> fullDayList = new ArrayList<MonthBean>();
        if (day <= 0) day = 1;
        Calendar cal = Calendar.getInstance();// 获得当前日期对象
        cal.clear();// 清除信息
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);// 1月从0开始
        cal.set(Calendar.DAY_OF_MONTH, day);// 设置为1号,当前日期既为本月第一天
        int count = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int j = 0; j <= (count - 1); ) {
            if (sdf.format(cal.getTime()).equals(getLastDay(year, month)))
                break;
            cal.add(Calendar.DAY_OF_MONTH, j == 0 ? +0 : +1);
            j++;
            String msg = "";
            if (month >= 10) {
                msg = sdf.format(cal.getTime());
            } else {
                msg = sdf.format(cal.getTime()).substring(1);
            }
            if (isYear && cal.equals(now)) {
                //今天
                msg = msg + "今天";
            } else {
                msg = msg + arr[cal.get(Calendar.DAY_OF_WEEK) - 1];
            }
            String formatMonth;
            if (month < 10) {
                formatMonth = "0" + month;
            } else {
                formatMonth = String.valueOf(month);
            }
            String formatDay;
            if (j < 10) {
                formatDay = "0" + (j);
            } else {
                formatDay = String.valueOf(j);
            }
            fullDayList.add(new MonthBean(msg, formatMonth, formatDay));
        }
        return fullDayList;
    }

    @SuppressLint("SimpleDateFormat")
    private static String getLastDay(int year, int month) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, 0);
        return sdf.format(cal.getTime());
    }
}
