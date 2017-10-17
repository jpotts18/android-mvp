package io.jpotts18.android_mvp.domain.loggin;

import io.jpotts18.android_mvp.domain.models.User;
import retrofit2.Response;


/**
 * Created by jpotts18 on 5/12/15.
 */
public interface OnLoginInteractorFinishedListener {
    void onNetworkSuccess(User user, Response response);
    void onNetworkFailure(Throwable throwable);
}
