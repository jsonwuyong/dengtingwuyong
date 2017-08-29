package com.dengting.mvp.mode;

import android.app.Dialog;

import com.dengting.mvp.mode.impl.LoginModel;

/**
 * Created by dengting on 2017/7/26.
 */

public interface ILoginModel {


    void login(Dialog dialog, String username, String password, LoginModel.OnLoginListener loginListener);
}
