package com.taoxu.stickyscrollview;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.taoxu.library.StickyScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StickyScrollView scrollView = (StickyScrollView) findViewById(R.id.scrollView);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        TabLayout.Tab tab =tabLayout.newTab();
        tab.setText("标签第一个");
        tabLayout.addTab(tab);
        TabLayout.Tab tab2 =tabLayout.newTab();
        tab2.setText("标签第二个");
        tabLayout.addTab(tab2);
        TabLayout.Tab tab3 =tabLayout.newTab();
        tab3.setText("标签第三个");
        tabLayout.addTab(tab3);
        TabLayout.Tab tab4 =tabLayout.newTab();
        tab4.setText("标签第四个");
        tabLayout.addTab(tab4);
        TabLayout.Tab tab5=tabLayout.newTab();
        tab5.setText("标签第五个");
        tabLayout.addTab(tab5);
        TabLayout.Tab tab6 =tabLayout.newTab();
        tab6.setText("标签第六个");
        tabLayout.addTab(tab6);
    }
}
