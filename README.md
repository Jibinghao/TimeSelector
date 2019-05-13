# TimeSelector
   一款针对android平台的时间选择器，支持选择年月日时分秒上下午，支持背景高斯模糊等功能。<br> 

  [我的博客地址](https://www.jibinghao.com) 
  
[![](https://jitpack.io/v/Jibinghao/TimeSelector.svg)](https://jitpack.io/#Jibinghao/TimeSelector)
  
## 演示效果

![image](https://github.com/Jibinghao/TimeSelector/blob/master/example/example.gif)



## 集成方式

方式一 compile引入

```
dependencies {
     implementation 'com.github.Jibinghao:TimeSelector:v1.2'
}

```

项目根目录build.gradle加入

```
allprojects {
   repositories {
      jcenter()
      maven { url 'https://jitpack.io' }
   }
}
```

方式二 maven引入

step 1.
```
<repositories>
       <repository>
       <id>jitpack.io</id>
	<url>https://jitpack.io</url>
       </repository>
 </repositories>
```
step 2.
```

<dependency>
      <groupId>com.github.Jibinghao</groupId>
	    <artifactId>TimeSelector</artifactId>
	    <version>v1.2</version> 
</dependency>

```
## 功能配置
```
// 显示时间选择器 以下是例子：用不到的api可以不写
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
``` 

## 更新日志

# 当前版本：
* v1.2
* 1.修复标题为空的bug


# 历史版本：
* v1.2
* 1.修复标题为空的bug

* v1.1
* 1.增加取消文字，确定文字的文本及颜色设置；
* 2.增加背景高斯模糊的选项

* v1.0
* 1.init


