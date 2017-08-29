package com.dengting.mvp.presenter;

import com.dengting.domain.UserInfo;
import com.dengting.login.ILoginView;
import com.dengting.mvp.mode.impl.LoginModel;

/**
 * Created by dengting on 2017/7/26.
 */

public class LoginPresenter {

    /**
     * v层
     */
    private ILoginView loginView;

    /**
     * m层
     */
    private LoginModel loginModel;

    /**
     * mvp模式  p层持有  v 和m 的接口引用 来进行数据的传递  起一个中间层的作用
     *
     * @param loginView
     */
    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
        /**
         *示例化loginmodel对象  固定写法  Retrofit.create(Class);
         */
        this.loginModel = new LoginModel();
    }

    /**
     * 登陆
     */
    public void login() {

        loginModel.login(loginView.getDialog(), loginView.getUserName(), loginView.getPassword(),
                new LoginModel.OnLoginListener() {
            @Override
            public void onSuccess(UserInfo userInfo) {
                //请求成功服务器返回的数据s
                loginView.setText(userInfo.toString());
            }

            @Override
            public void onFailure(String msg) {
                //请求成功服务器返回的错误信息
                loginView.showMsg(msg);
            }
        });
    }

}
