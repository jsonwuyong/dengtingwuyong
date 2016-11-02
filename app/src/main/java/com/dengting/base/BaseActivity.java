package com.dengting.base;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;

import com.dengting.interfaces.IHandler;
import com.dengting.mode.IDataCallback;
import com.dengting.mode.Logiestmode;
import com.dengting.mode.MyDate;

/**
 * Created by dengting on 2016/11/2.
 */

public abstract class BaseActivity extends Activity implements View.OnClickListener {

    private static final int ACTIVITY_RESUME = 0;
    private static final int ACTIVITY_STOP = 1;
    private static final int ACTIVITY_PAUSE = 2;
    private static final int ACTIVITY_DESTROY = 3;

    // 数据回调接口，都传递Domine的子类实体
    protected IDataCallback<MyDate<? extends Logiestmode>> dataCallback;

    public int activityState;

    // 是否允许全屏
    private boolean mAllowFullScreen = true;

    protected static UIHandler handler = new UIHandler(Looper.getMainLooper());

    @Override
    public void onClick(View v) {
        widgetClick(v);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initWidget();
        setHandler();
    }

    public abstract void widgetClick(View v);

    public abstract void initWidget();

    private void setHandler() {
        handler.setHandler(new IHandler() {
            public void handleMessage(Message msg) {
                handler(msg);//有消息就提交给子类实现的方法
            }
        });
    }

    protected void addLeftMenu(boolean enable) {
        // 如果你的项目有侧滑栏可以处理此方法
        if (enable) { // 是否能有侧滑栏

        } else {

        }
    }

    // 横竖屏切换，键盘等
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    //让子类处理消息
    protected abstract void handler(Message msg);

    public void setDataCallback(
            IDataCallback<MyDate<? extends Logiestmode>> dataCallback) {
        this.dataCallback = dataCallback;
    }

}
