package com.jibinghao.ztlibrary.listener;

import com.jibinghao.ztlibrary.widget.WheelView;

/**
 * FileName: OnWheelScrollListener
 * Author: jibinghao
 * Date: 2019/5/13 9:46 AM
 * Email:heybinghao@gmail.com
 * Description:
 */

public interface OnWheelScrollListener {

    void onScrollingStarted(WheelView wheel);


    void onScrollingFinished(WheelView wheel);
}
