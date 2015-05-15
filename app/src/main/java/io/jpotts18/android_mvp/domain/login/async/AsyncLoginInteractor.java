package io.jpotts18.android_mvp.domain.login.async;

import android.os.Handler;

/**
 * Created by jpotts18 on 5/11/15.
 */
public class AsyncLoginInteractor implements IAsyncLoginInteractor {

    /******************************************************************************************
     * An Interactor helps models cross application boundaries such as networks or serialization
     * This LoginInteractor knows nothing about a UI or the LoginPresenter
     * Because this is an asynchronous call it will call back on the OnLoginFinishedListener when complete
     *******************************************************************************************
     */

    public void validateCredentialsAsync(final OnLoginFinishedListener listener, final String username, final String password){
        // Mock login. I'm creating a handler to delay the answer a couple of seconds
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                if ((username.length() > 3) && (password.length() > 3)) {
                    listener.onSuccess();
                } else {
                    listener.onError();
                }
            }
        }, 2000);
    }
}
