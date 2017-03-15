# StickyScrollView
这个库修复了likebamboo/StickyScrollView里，让TabLayout悬浮以及其他附带动画效果的View悬浮产生的动画不流畅的问题（默认3秒以内，若是动画时间过长，请自行调用setRunnableRecycleTime方法设定自动刷新时间），并且还提供了列表形式的Sticky显示。

工程默认显示是列表形式的，可以在xml中指定  app:mode="@integer/integer_sticky_arrayMode"（列表模式），和app:mode="@integer/integer_sticky_normalMode"（普通模式）（默认）的样式。
或者可以在代码中，调用setMode方法来设置样式。


还提供了一个滑动事件监听setOnScrollListener，可以监听ScrollView的滑动事件
