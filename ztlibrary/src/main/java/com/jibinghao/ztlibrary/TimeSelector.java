package com.jibinghao.ztlibrary;

import android.app.Activity;
import android.content.Context;

import com.jibinghao.ztlibrary.listener.TimeSelectCallBack;

/**
 * FileName: TimeSelector
 * Author: jibinghao
 * Date: 2019/5/13 11:17 AM
 * Email:heybinghao@gmail.com
 * Description:
 */

public class TimeSelector {

    String title;
    TimeSelectCallBack timeSelectCallBack;
    Activity activity;

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

    public void show() {
        TimeSelectDialog dialog = new TimeSelectDialog(activity, title, timeSelectCallBack);
        dialog.show();
    }
}
