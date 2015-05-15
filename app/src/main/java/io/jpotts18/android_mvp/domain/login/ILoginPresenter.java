package io.jpotts18.android_mvp.domain.login;

/**
 * Created by jpotts18 on 5/11/15.
 */
public interface ILoginPresenter {
    void attemptLogin(String username, String password);
}
