package io.jpotts18.android_mvp.domain.repos;

import android.widget.Toast;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import io.jpotts18.android_mvp.domain.GithubService;
import io.jpotts18.android_mvp.domain.models.Repo;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jpotts18 on 5/11/15.
 */
public class RepoListInteractor {

    private OnRepoInteractorFinishedListener listener;
    private CompositeDisposable mCompositeDisposable;

    public RepoListInteractor(OnRepoInteractorFinishedListener listener) {
        this.listener = listener;
    }

    private Retrofit initRetrofit(){
        Retrofit retrofit =  new Retrofit.Builder()
                .baseUrl("https://api.github.com")
//                .setEndpoint("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return retrofit;
    }

    private void handleResponse(Response<List<Repo>> response) {

        List<Repo> list=response.body();
        Collections.sort(list, new Comparator<Repo>() {
            @Override
            public int compare(Repo left, Repo right) {
                return (left.stargazers_count > right.stargazers_count) ? -1 : 1;
            }
        });

        listener.onNetworkSuccess(list, response);
    }

    private void handleError(Throwable throwable) {
        listener.onNetworkFailure(throwable);
    }

    public void loadRecentCommits(String username) {
        Retrofit retrofit = initRetrofit();
        GithubService githubService= retrofit.create(GithubService.class);
        mCompositeDisposable = new CompositeDisposable();

        mCompositeDisposable.add(githubService.listRepos(username)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::handleResponse,this::handleError));

//        Call<List<Repo>> call= githubService.listRepos(username);
//        call.enqueue(this);
    }


   /* @Override
    public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {

        List<Repo>  list = response.body();
        Collections.sort(list, new Comparator<Repo>() {
            @Override
            public int compare(Repo left, Repo right) {
                return (left.stargazers_count > right.stargazers_count) ? -1 : 1;
            }
        });

        listener.onNetworkSuccess(list, response);
    }

    @Override
    public void onFailure(Call<List<Repo>> call, Throwable t) {
        listener.onNetworkFailure(t);
    }*/

   /* @Override
    public void success(List<Repo> list, Response response) {
        Collections.sort(list, new Comparator<Repo>() {
            @Override
            public int compare(Repo left, Repo right) {
                return (left.stars > right.stars) ? -1 : 1;
            }
        });

        listener.onNetworkSuccess(list, response);
    }

    @Override
    public void failure(RetrofitError error) {
        listener.onNetworkFailure(error);
    }*/
}
