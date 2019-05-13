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
     implementation 'com.github.Jibinghao:TimeSelector:v1.0'
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
	    <version>v1.0</version> 
</dependency>

```

## 更新日志

# 当前版本：
* v1.0
* 1.init

# 历史版本：
* v1.0
* 1.init


