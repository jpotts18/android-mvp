package io.jpotts18.android_mvp.domain.login.sync;

import io.jpotts18.android_mvp.domain.login.sync.ISynchronousLoginInteractor;

/**
 * Created by jpotts18 on 5/11/15.
 */
public class SynchronousLoginInteractor implements ISynchronousLoginInteractor {

    /******************************************************************************************
     * An Interactor helps models cross application boundaries such as networks or serialization
     * This LoginInteractor knows nothing about a UI or the LoginPresenter
     *******************************************************************************************
     */

    public SynchronousLoginInteractor() { }

    public boolean validatedCredentials(String username, String password) {
        return username.contains("gmail");
    }
}
