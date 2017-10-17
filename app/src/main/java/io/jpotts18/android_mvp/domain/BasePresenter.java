package io.jpotts18.android_mvp.domain;

/**
 * Created by John on 10/16/2017.
 */

public interface BasePresenter<T> {

    void attachView(T view);

    void detachView();
}
