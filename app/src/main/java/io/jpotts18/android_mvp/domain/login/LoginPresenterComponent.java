package io.jpotts18.android_mvp.domain.login;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by podo on 10/5/15.
 */
@Singleton
@Component(modules = {LoginPresenterModule.class})
public interface LoginPresenterComponent {
    LoginPresenter provideLoginPresenter();
}
