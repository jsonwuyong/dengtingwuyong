package com.dengting.lovedengting;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.dengting.login.ILoginView;
import com.dengting.mvp.presenter.LoginPresenter;
import com.dengting.utils.DialogUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DengActivity extends AppCompatActivity implements ILoginView{

    @BindView(R.id.email)
    EditText etUserName;
    @BindView(R.id.password)
    EditText etPassword;
    @BindView(R.id.btn_login)
    Button btnLogin;
    private Dialog dialog;



    /**
     * p层对象 来调取p层的方法
     */
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deng);
        ButterKnife.bind(this);

    /**
     * 实例化p  构造方法需要一个实现了ILoginView的类 当前activity实现了ILoginView 所以直接传this即可
    */
        loginPresenter = new LoginPresenter(this);

        dialog = DialogUtils.createLoadingDialog(this, "登陆中...");

    }

    @Override
    public Dialog getDialog() {
        return null;
    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public void showMsg(String msg) {

    }

    /**
     * 调用登录方法进行登陆
     */
    @OnClick(R.id.btn_login)
    public void onClick() {
        
        loginPresenter.login();
    }


    @Override
    public void setText(String result) {

    }
}
