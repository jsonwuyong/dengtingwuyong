package com.dengting.login;

import android.os.Bundle;
import android.os.Message;
import android.view.View;

import com.dengting.base.BaseActivity;
import com.dengting.mode.IDataCallback;
import com.dengting.mode.Logiestmode;
import com.dengting.mode.MyDate;

import dym.unique.com.springinglayoutlibrary.view.SpringingEditText;
import dym.unique.com.springinglayoutlibrary.view.SpringingImageView;
import dym.unique.com.springinglayoutlibrary.view.SpringingTextView;
import dym.unique.com.springinglayoutlibrary.viewgroup.SpringingLinearLayout;
import dym.unique.com.springinglayoutlibrary.viewgroup.SpringingRelativeLayout;

/**
 * Created by dengting on 2016/11/2.
 */

public class loginRegistActivity extends BaseActivity implements
                 IDataCallback<MyDate<? extends Logiestmode>>{
    private SpringingRelativeLayout srl_actionBar = null;
    private SpringingImageView simg_back = null;
    private SpringingLinearLayout sll_mainContainer = null;
    private SpringingImageView simg_avatarMan = null;
    private SpringingEditText sedt_account = null;
    private SpringingEditText sedt_password = null;
    private SpringingTextView stv_regist = null;
    private SpringingTextView stv_login = null;

    private boolean isContentShow = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initWidget();


    }


    @Override
    public void onClick(View v) {
        super.onClick(v);
    }

    @Override
    public void widgetClick(View v) {

    }

    @Override
    public void initWidget() {

    }

    @Override
    protected void handler(Message msg) {

    }

    @Override
    public void setDataCallback(IDataCallback<MyDate<? extends Logiestmode>> dataCallback) {
        super.setDataCallback(dataCallback);
    }

    @Override
    public void onNewData(MyDate<? extends Logiestmode> data) {

    }

    @Override
    public void onError(String msg, int code) {

    }
}
