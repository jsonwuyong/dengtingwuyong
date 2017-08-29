package com.dengting.request;

import com.dengting.domain.UserInfo;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by dengting on 2017/7/26.
 */

public interface ApiService {

    /**
     * 用户登陆
     *
     * @param username
     * @param password
     * @return
     */
    @FormUrlEncoded
    @POST("AppUser/loginin")
    rx.Observable<ResponseResult<UserInfo>> login(@Field("username") String username, @Field("password") String password);


}
