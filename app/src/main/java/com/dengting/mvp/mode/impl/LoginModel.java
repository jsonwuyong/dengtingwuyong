package com.dengting.mvp.mode.impl;

import android.app.Dialog;

import com.dengting.domain.UserInfo;
import com.dengting.mvp.mode.ILoginModel;
import com.dengting.request.ApiService;
import com.dengting.request.DialogSubscriber;
import com.dengting.request.OkHttpUtils;
import com.dengting.request.ResponseResult;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by dengting on 2017/7/26.
 */

public class LoginModel implements ILoginModel {


    @Override
    public void login(Dialog dialog, String username, String password,final OnLoginListener loginListener) {

        /**
         * 被订阅者
         */
        Observable<ResponseResult<UserInfo>> observable = OkHttpUtils.
                getRetrofit().create(ApiService.class).login(username, password);

        /**
         * 订阅者 true这里是控制其请求显示对话框
         */
        Subscriber<ResponseResult<UserInfo>> subscriber = new DialogSubscriber<ResponseResult<UserInfo>>(dialog , true) {
            @Override
            public void onSuccess(ResponseResult<UserInfo> userInfoUserResponseResult) {
                switch (userInfoUserResponseResult.getResult()) {
                    case 1:
                        loginListener.onSuccess(userInfoUserResponseResult.getData());
                        break;
                    case 0:
                        loginListener.onFailure(userInfoUserResponseResult.getMsg());
                        break;
                    case -1:
                        loginListener.onFailure(userInfoUserResponseResult.getMsg());
                        break;
                }
            }

            @Override
            public void onFailure(String msg) {
                loginListener.onFailure(msg);
            }
        };

        observable.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 回调接口用来把数据返回给p
     */
    public interface OnLoginListener {

        /**
         * 请求成功的回调方法
         * @param userInfo  用户信息
         */
        void onSuccess(UserInfo userInfo);

        /**
         * 请求失败的回调方法
         * @param msg   失败的信息
         */
        void onFailure(String msg);
    }

}
