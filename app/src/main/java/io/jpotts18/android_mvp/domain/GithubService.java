package io.jpotts18.android_mvp.domain;

import java.util.List;

import io.jpotts18.android_mvp.domain.models.Repo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by jpotts18 on 5/12/15.
 */

public interface GithubService {
    @GET("/users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);
}