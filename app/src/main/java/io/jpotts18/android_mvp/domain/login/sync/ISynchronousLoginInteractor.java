package io.jpotts18.android_mvp.domain.login.sync;

/**
 * Created by jpotts18 on 5/11/15.
 */
public interface ISynchronousLoginInteractor {
    boolean validatedCredentials(String username, String password);
}
