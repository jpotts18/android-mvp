package io.jpotts18.android_mvp.domain.login;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by podo on 10/5/15.
 */
@Module
public class LoginPresenterModule {
    private final ILoginView loginView ;

    public LoginPresenterModule(ILoginView loginView) {
        this.loginView = loginView;
    }

    @Provides  @Singleton
    LoginPresenter provideLoginPresenter(){
        return new LoginPresenter(loginView,new SynchronousLoginInteractor());
    }

}
