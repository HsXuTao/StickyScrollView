# StickyScrollView

</br>

[![](https://jitpack.io/v/HsXuTao/StickyScrollView.svg)](https://jitpack.io/#HsXuTao/StickyScrollView)

</br>

#### 相信大家都知道有很多让ListView分组Header浮动悬停的开源控件，比如：StickyListHeaders、pinned-section-listview,而本项目就是要在ScrollView中实现类似的功能。StickyScrollView 是一个让ScrollView同样支持浮动悬停的控件(该控件支持android2.2(api level 8)及以上的版本)。
</br>


#### 这个库修复了emilsjolander/StickyScrollViewItems里，让TabLayout悬浮以及其他附带动画效果的View悬浮产生的动画不流畅的问题（默认1秒以内，若是动画时间过长，请自行调用setRunnableRecycleTime方法设定自动刷新时间），并且还提供了列表形式的Sticky显示。

</br>

#### 工程默认显示是列表形式的，可以在xml中指定 

</br>

app:mode="@integer/integer_sticky_arrayMode"（列表模式）

</br>

#### 和

</br>

app:mode="@integer/integer_sticky_normalMode"（普通模式）（默认）

</br>

#### 的样式。或者可以在代码中，调用setMode方法来设置样式。</br></br>


#### 还提供了一个滑动事件监听setOnScrollListener，可以监听ScrollView的滑动事件

</br>

如何使用：
1：在你根目录里的build.gradle添加如下代码
```java
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```


2：在你的工程里，加入
```java
dependencies {
    compile 'com.github.HsXuTao:StickyScrollView:V1.1.6'
}
```

3：将您的ScrollView用StickyScrollView替换：
```java
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_height="match_parent" android:layout_width="match_parent">
    <!-- scroll view child goes here -->
</ScrollView>
```

替换成
```java
<StickyScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_height="match_parent" android:layout_width="match_parent"
    android:id="@+id/sticky_scroll"
    app:mode="@integer/integer_sticky_arrayMode">
    <!-- scroll view child goes here -->
</StickyScrollView>
```


4：然后将View添加一个值为sticky的tag：
```java
<StickyScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/sticky_scroll"
    android:layout_height="match_parent" android:layout_width="match_parent"
    app:mode="@integer/integer_sticky_arrayMode">

    <LinearLayout 
        android:layout_height="match_parent" android:layout_width="match_parent" 
        android:orientation="horizontal">
        
        <!-- other children -->
        
            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:background="#440000"
                android:padding="10dp"
                android:tag="sticky"
                android:textSize="20sp"
                />

        <!-- other children -->

    </LinearLayout>

</StickyScrollView>
```

之后，您对应Tag的View就能在您的View可以悬停的时候开始悬停工作

#### 注意：你也可以通过addView方法来添加需要悬停的View，同样，也需要设置tag为sticky即可

</br>


版本更新：

</br>

V1.1.6

</br>

修复了在某些情况下可能会出现的空制针导致崩溃的问题

V1.1.6

</br>

修改了StickyScrollView默认自动刷新时间为1s以减少内存的开销（之前版本是3s），如有特殊需求，依旧可以使用setRunnableRecycleTime方法自行设定。
新增setHideStickyView方法，可以自行控制悬停的View是否要隐藏（通常只会出现在悬停View附带Alpha值的情况下）

V1.1.5

</br>

基于emilsjolander/StickyScrollViewItems库进行的修复原有bug和新增功能，发布了V1.1.5版本，主要功能是提供悬停的StickyScrollView
主要修复/新增内容：
修复了emilsjolander/StickyScrollViewItems库中，嵌套TabLayout时出现的用户点击动画不流畅的问题。
修复了emilsjolander/StickyScrollViewItems库中，包含带Alpha的View出现的Alpha值不正确的问题。

新增列表形式的悬停方式。