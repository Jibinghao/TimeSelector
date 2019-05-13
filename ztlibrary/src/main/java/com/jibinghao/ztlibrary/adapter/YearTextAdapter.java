package com.jibinghao.ztlibrary.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.jibinghao.ztlibrary.R;
import com.jibinghao.ztlibrary.entity.YearBean;

import java.util.ArrayList;

/**
 * FileName: YearTextAdapter
 * Author: jibinghao
 * Date: 2019/5/13 10:30 AM
 * Email:heybinghao@gmail.com
 * Description:
 */

public class YearTextAdapter extends AbstractWheelTextAdapter {
    ArrayList<YearBean> list;

    public YearTextAdapter(Context context, ArrayList<YearBean> list, int currentItem, int maxsize, int minsize) {
        super(context, R.layout.item_wheel_view_year, NO_RESOURCE, currentItem, maxsize, minsize);
        this.list = list;
        setItemTextResource(R.id.core_wv_temp_value);
    }

    @Override
    public View getItem(int index, View cachedView, ViewGroup parent) {
        View view = super.getItem(index, cachedView, parent);
        return view;
    }

    @Override
    public int getItemsCount() {
        return list.size();
    }

    @Override
    public CharSequence getItemText(int index) {
        return list.get(index).getYear();
    }
}