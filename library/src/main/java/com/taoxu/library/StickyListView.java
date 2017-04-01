package com.taoxu.library;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by tao.xu on 2017/3/21.
 */
public class StickyListView extends FrameLayout {
    public StickyListView(Context context) {
        super(context);
    }

    public StickyListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public StickyListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public StickyListView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
