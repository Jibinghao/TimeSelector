package com.jibinghao.timeselector;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.jibinghao.ztlibrary.TimeSelector;
import com.jibinghao.ztlibrary.listener.TimeSelectCallBack;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    /**
     * 时间选择器
     */
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void showDialog() {
        TimeSelector.getInstance()
                .setActivity(this)
                .setTitle("选择时间") //弹窗标题
                .setCancelTitle("取消") //取消按钮的文字
                .setConfirmTitle("确定") //确定按钮的文字
                .setCancelTextColor(Color.BLUE) //取消按钮的颜色
                .setConfirmTextColor(Color.RED) //确定按钮的颜色
                .setCycle(false) //是否支持数据循环
                .setBlur(true) //是否支持背景高斯模糊
                .setFiveSecondInterval(false) //秒的数据是否为5的倍数
                .setTimeSelectCallBack(new TimeSelectCallBack() {
                    @Override
                    public void onChoose(String formatTime, long originTime) {
                        Log.d(TAG, formatTime);
                        Log.d(TAG, originTime + "");
                        Toast.makeText(MainActivity.this, formatTime, Toast.LENGTH_LONG).show();

                    }
                })
                .show();
    }

    private void initView() {
        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.button:
                showDialog();
                break;
        }
    }
}
