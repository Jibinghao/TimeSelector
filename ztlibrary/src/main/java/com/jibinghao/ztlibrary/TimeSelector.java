package com.jibinghao.ztlibrary;

import android.app.Activity;

import com.jibinghao.ztlibrary.listener.TimeSelectCallBack;

/**
 * FileName: TimeSelector
 * Author: jibinghao
 * Date: 2019/5/13 11:17 AM
 * Email:heybinghao@gmail.com
 * Description:
 */

public class TimeSelector {

    String title;//标题
    TimeSelectCallBack timeSelectCallBack;
    Activity activity;
    boolean isBlur = true;//是否需要模糊 默认为开启
    String cancelTitle;//取消的文字
    String confirmTitle;//确定的文字
    boolean isCycle;//是否循环数据
    boolean isFiveSecondInterval;//是否使用5秒间隔

    int cancelTextColor;
    int confirmTextColor;
    boolean[] type = {true, true, true};//分别控制“年月”,“分”“秒”的显示或隐藏。


    public TimeSelector setCancelTextColor(int cancelTextColor) {
        this.cancelTextColor = cancelTextColor;
        return this;

    }

    public TimeSelector setConfirmTextColor(int confirmTextColor) {
        this.confirmTextColor = confirmTextColor;
        return this;

    }

    public TimeSelector setBlur(boolean blur) {
        isBlur = blur;
        return this;

    }

    public TimeSelector setCancelTitle(String cancelTitle) {
        this.cancelTitle = cancelTitle;
        return this;

    }

    public TimeSelector setConfirmTitle(String confirmTitle) {
        this.confirmTitle = confirmTitle;
        return this;

    }

    public TimeSelector setCycle(boolean cycle) {
        isCycle = cycle;
        return this;
    }

    public TimeSelector setFiveSecondInterval(boolean fiveSecondInterval) {
        isFiveSecondInterval = fiveSecondInterval;
        return this;
    }

    public static TimeSelector getInstance() {
        return new TimeSelector();
    }

    public TimeSelector setActivity(Activity activity) {
        this.activity = activity;
        return this;
    }

    public TimeSelector setTitle(String title) {
        this.title = title;
        return this;
    }


    public TimeSelector setTimeSelectCallBack(TimeSelectCallBack timeSelectCallBack) {
        this.timeSelectCallBack = timeSelectCallBack;
        return this;

    }

    public TimeSelector setType(boolean[] type) {
        this.type = type;
        return this;
    }

    public void show() {
        TimeSelectDialog dialog = new TimeSelectDialog(activity, title, timeSelectCallBack);
        dialog.setBlur(isBlur);
        dialog.setCancelTextColor(cancelTextColor);
        dialog.setCancelTitle(cancelTitle);
        dialog.setConfirmTextColor(confirmTextColor);
        dialog.setConfirmTitle(confirmTitle);
        dialog.setCycle(isCycle);
        dialog.setFiveSecondInterval(isFiveSecondInterval);
        dialog.setType(type);
        dialog.show();
    }
}
