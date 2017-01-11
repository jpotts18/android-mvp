package io.jpotts18.android_mvp.domain.repos;

import java.util.List;

import io.jpotts18.android_mvp.domain.models.Repo;
import retrofit2.Response;

/**
 * Created by jpotts18 on 5/12/15.
 */
public interface OnRepoInteractorFinishedListener {
    void onNetworkSuccess(List<Repo> list, Response response);
    void onNetworkFailure(Throwable throwable);
}
