package io.jpotts18.android_mvp.domain.login.async;

/**
 * Created by jpotts18 on 5/11/15.
 */
public interface IAsyncLoginInteractor {
    void validateCredentialsAsync(OnLoginFinishedListener listener, String username, String password);
}
