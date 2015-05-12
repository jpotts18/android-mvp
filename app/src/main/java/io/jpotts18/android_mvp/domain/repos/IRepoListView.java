package io.jpotts18.android_mvp.domain.repos;

import java.util.List;

import io.jpotts18.android_mvp.domain.models.Repo;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by jpotts18 on 5/11/15.
 */
public interface IRepoListView {
    void onReposLoadedSuccess(List<Repo> list, Response response);
    void onReposLoadedFailure(RetrofitError error);
}
