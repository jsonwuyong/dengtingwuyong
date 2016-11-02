package com.dengting.mode;

/**
 * Created by dengting on 2016/11/2.
 */

public interface IDataCallback<T> {

    public void onNewData(T data);
    public void onError(String msg,int code);
}
