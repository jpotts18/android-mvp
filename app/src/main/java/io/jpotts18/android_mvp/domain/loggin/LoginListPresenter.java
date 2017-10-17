package io.jpotts18.android_mvp.domain.loggin;

import io.jpotts18.android_mvp.domain.models.User;
import retrofit2.Response;

/**
 * Created by jpotts18 on 5/11/15.
 */
public class LoginListPresenter implements LoginContract.Presenter, OnLoginInteractorFinishedListener {

    private LoginContract.View view;
    private LoginInteractor interactor;

    public LoginListPresenter(LoginContract.View view) {
        this.view = view;
        this.interactor = new LoginInteractor(this); // pass in the InteractorListener
    }

    @Override
    public void onNetworkSuccess(User user, Response response) {
        view.navigateToPersonListActivity();
    }

    @Override
    public void onNetworkFailure(Throwable throwable) {
        view.showLoginError(throwable);
    }


    @Override
    public void attachView(LoginContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;

    }

    @Override
    public void authenticateUser(String user, String password) {
        interactor.authenticate(user, password);

    }

    @Override
    public void result(int requestCode, int resultCode) {
    }
}
