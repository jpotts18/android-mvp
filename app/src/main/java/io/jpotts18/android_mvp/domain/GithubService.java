package io.jpotts18.android_mvp.domain;

import java.util.List;

import io.jpotts18.android_mvp.domain.models.Repo;
//import retrofit.Callback;
//import retrofit.http.GET;
//import retrofit.http.Path;
import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by jpotts18 on 5/12/15.
 */

public interface GithubService {
    @GET("/users/{user}/repos")
    Observable<Response<List<Repo>>> listRepos(@Path("user") String user);
}