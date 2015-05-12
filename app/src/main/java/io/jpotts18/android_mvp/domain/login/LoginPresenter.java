package io.jpotts18.android_mvp.domain.login;

/**
 * Created by jpotts18 on 5/11/15.
 */
public class LoginPresenter implements ILoginPresenter {

    /******************************************************************************************
    - LoginPresenter has a reference to both the View and the Interactor
    - LoginPresenter retrieves data from the model, and notifies the view to display it.
    *******************************************************************************************
    */

    // Referencing any class that implements the ILoginView interface provides greater flexibility
    private ILoginView view;
    private SynchronousLoginInteractor interactor;

    public LoginPresenter(ILoginView loginView) {
        this.view = loginView;
        this.interactor = new SynchronousLoginInteractor();
    }

    public void attemptLogin(String username, String password){
        boolean isValid = interactor.validatedCredentials(username, password);
        if (isValid) view.navigateToListActivity(); else view.loginFailed();
    }
}
