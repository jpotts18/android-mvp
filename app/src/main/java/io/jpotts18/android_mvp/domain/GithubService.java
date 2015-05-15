package io.jpotts18.android_mvp.domain;

import java.util.List;

import io.jpotts18.android_mvp.domain.models.Repo;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by jpotts18 on 5/12/15.
 */

public interface GithubService {
    @GET("/users/{user}/repos")
    void listRepos(@Path("user") String user, Callback<List<Repo>> callback);
}