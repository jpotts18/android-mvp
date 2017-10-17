package io.jpotts18.android_mvp.domain;

import java.util.List;

import io.jpotts18.android_mvp.domain.models.Repo;
//import retrofit.Callback;
//import retrofit.http.GET;
//import retrofit.http.Path;
import io.jpotts18.android_mvp.domain.models.User;
import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by jpotts18 on 5/12/15.
 */

public interface PipeDriveService {
    @Headers({"Content-Type: application/json"})
    @POST("/authorizations")
    Observable<Response<User>> listRepos(@Field("user") String user, @Field("password") String password);
}