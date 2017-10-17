package io.jpotts18.android_mvp.domain.loggin;




import io.jpotts18.android_mvp.domain.Config;
import io.jpotts18.android_mvp.domain.PipeDriveService;

import io.jpotts18.android_mvp.domain.models.User;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jpotts18 on 5/11/15.
 */
public class LoginInteractor {

    private OnLoginInteractorFinishedListener listener;
    private CompositeDisposable mCompositeDisposable;

    public LoginInteractor(OnLoginInteractorFinishedListener listener) {
        this.listener = listener;
    }

    private Retrofit initRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Config.BASE_URL)
//                .setEndpoint("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return retrofit;
    }

    private void handleResponse(Response<User> response) {
        User authUser = response.body();
        /*Collections.sort(list, new Comparator<Repo>() {
            @Override
            public int compare(Repo left, Repo right) {
                return (left.stargazers_count > right.stargazers_count) ? -1 : 1;
            }
        });*/
        listener.onNetworkSuccess(authUser, response);
    }

    private void handleError(Throwable throwable) {
        listener.onNetworkFailure(throwable);
    }

    public void authenticate(String username, String password) {
        Retrofit retrofit = initRetrofit();
        PipeDriveService pipeDriveService = retrofit.create(PipeDriveService.class);
        mCompositeDisposable = new CompositeDisposable();

        mCompositeDisposable.add(pipeDriveService.listRepos(username, password)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<Response<User>>() {
                    @Override
                    public void accept(Response<User> userResponse) throws Exception {
                        handleResponse(userResponse);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        handleError(throwable);
                    }
                }));
    }
}
