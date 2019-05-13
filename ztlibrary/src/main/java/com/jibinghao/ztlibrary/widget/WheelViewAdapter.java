package com.jibinghao.ztlibrary.widget;

/**
 * FileName: WheelViewAdapter
 * Author: jibinghao
 * Date: 2019/5/13 9:41 AM
 * Email:heybinghao@gmail.com
 * Description:
 */

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

public interface WheelViewAdapter {
    /**
     * 得到项目统计
     *
     * @return the count of wheel items
     */
    int getItemsCount();

    /**
     * 得到一个视图,在指定的位置显示数据集的数据
     *
     * @param index       项指数
     * @param convertView 如果可能的话，旧视图的重用
     * @param parent      the parent that this view will eventually be attached to
     * @return the wheel item View
     */
    View getItem(int index, View convertView, ViewGroup parent);

    /**
     * Get a View that displays an empty wheel item placed before the first or
     * after the last wheel item.
     *
     * @param convertView the old view to reuse if possible
     * @param parent      the parent that this view will eventually be attached to
     * @return the empty item View
     */
    View getEmptyItem(View convertView, ViewGroup parent);

    /**
     * Register an observer that is called when changes happen to the data used
     * by this adapter.
     *
     * @param observer the observer to be registered
     */
    void registerDataSetObserver(DataSetObserver observer);

    /**
     * Unregister an observer that has previously been registered
     *
     * @param observer the observer to be unregistered
     */
    void unregisterDataSetObserver(DataSetObserver observer);
}
