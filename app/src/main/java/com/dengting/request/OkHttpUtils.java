package com.dengting.request;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dengting on 2017/7/26.
 */

public class OkHttpUtils {

    /**
     * okhttp
     */
    private static OkHttpClient okHttpClient;


    /**
     * Retrofit
     */
    private static Retrofit retrofit;

    /**
     * 获取Retrofit的实例
     *
     * @return retrofit
     */
    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://121.8.249.13:8081/gdmsaec-app/act/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(getOkHttpClient())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
        }
        return retrofit;
    }


    private static OkHttpClient getOkHttpClient() {
        if (okHttpClient == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.connectTimeout(15, TimeUnit.SECONDS);
            okHttpClient = builder.build();
        }
        return okHttpClient;
    }
}
