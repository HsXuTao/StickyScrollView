package com.taoxu.stickyscrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.taoxu.library.StickyScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StickyScrollView scrollView = (StickyScrollView) findViewById(R.id.scrollView);
    }
}
