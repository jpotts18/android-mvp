package io.jpotts18.android_mvp.domain;

import io.jpotts18.android_mvp.domain.models.User;
import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by jpotts18 on 5/12/15.
 */

public interface PipeDriveService {
    @Headers({"Content-Type: application/json"})
    @FormUrlEncoded
    @POST("/authorizations")
    Observable<Response<User>> listRepos(@Field("user") String user, @Field("password") String password);
}