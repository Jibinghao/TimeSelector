package com.jibinghao.timeselector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.jibinghao.ztlibrary.TimeSelectDialog;
import com.jibinghao.ztlibrary.TimeSelector;
import com.jibinghao.ztlibrary.listener.TimeSelectCallBack;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.tv_click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });

    }

    private void showDialog() {
        new TimeSelector().setActivity(this)
                .setTitle("选择时间")
                .setTimeSelectCallBack(new TimeSelectCallBack() {
                    @Override
                    public void onChoose(String formatTime, long originTime) {
                        Log.d(TAG, formatTime);
                        Log.d(TAG, originTime + "");
                        Toast.makeText(MainActivity.this, formatTime, Toast.LENGTH_LONG).show();

                    }
                }).show();
    }
}
