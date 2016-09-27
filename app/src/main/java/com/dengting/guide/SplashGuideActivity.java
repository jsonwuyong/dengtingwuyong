package com.dengting.guide;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.dengting.adpter.BaseFragmentAdapter;
import com.dengting.lovedengting.R;

import java.util.ArrayList;
import java.util.List;

public class SplashGuideActivity extends FragmentActivity {

    private GuideViewPager vPager;
    private List<LauncherBaseFragment> list = new ArrayList<LauncherBaseFragment>();
    private BaseFragmentAdapter adapter;
    private ImageView[] tips;
    private int currentSelect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_guide);
        //初始化控件
        initWigthView();
    }

    private void initWigthView() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.viewGroup);
        tips = new ImageView[3];
        for(int i = 0;i<tips.length;i++){
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new LayoutParams(10, 10));
            if(i == 0){
                imageView.setBackgroundResource(R.mipmap.page_indicator_focused);
            }else{
                imageView.setBackgroundResource(R.mipmap.page_indicator_unfocused);
            }
            tips[i]=imageView;

            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
            layoutParams.leftMargin = 20;//设置点点点view的左边距
            layoutParams.rightMargin = 20;//设置点点点view的右边距
            viewGroup.addView(imageView,layoutParams);

        }
        //获取自定义viewpager 然后设置背景图片
        vPager = (GuideViewPager) findViewById(R.id.viewpager_launcher);
        vPager.setBackGroud(BitmapFactory.decodeResource(getResources(),R.mipmap.bg_kaka_launcher));

        MemoryWuHanLaunchFragment hanLaunchFragment = new MemoryWuHanLaunchFragment();
    }
}
