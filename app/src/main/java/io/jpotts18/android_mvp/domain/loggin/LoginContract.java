package io.jpotts18.android_mvp.domain.loggin;

import io.jpotts18.android_mvp.domain.BasePresenter;
import io.jpotts18.android_mvp.domain.BaseView;


/**
 * Created by John on 10/16/2017.
 */

public interface LoginContract {

    interface View extends BaseView<LoginListPresenter> {
        void showLoadingIndicator(boolean active);
        void showLoginError(Throwable throwable);
        void navigateToPersonListActivity();
    }

    interface Presenter extends BasePresenter<View> {

        void authenticateUser(String user, String password);
        void result(int requestCode, int resultCode);
    }
}
