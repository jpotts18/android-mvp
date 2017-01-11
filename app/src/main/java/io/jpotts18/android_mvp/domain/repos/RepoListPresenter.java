package io.jpotts18.android_mvp.domain.repos;

import java.util.List;

import io.jpotts18.android_mvp.domain.models.Repo;
import retrofit2.Response;

/**
 * Created by jpotts18 on 5/11/15.
 */
public class RepoListPresenter implements IRepoListPresenter, OnRepoInteractorFinishedListener {

    private IRepoListView view;
    private RepoListInteractor interactor;

    public RepoListPresenter(IRepoListView view) {
        this.view = view;
        this.interactor = new RepoListInteractor(this); // pass in the InteractorListener
    }

    @Override
    public void loadCommits(String username) {
        interactor.loadRecentCommits(username);
    }

    @Override
    public void onNetworkSuccess(List<Repo> list, Response response) {
        view.onReposLoadedSuccess(list, response);
    }

    @Override
    public void onNetworkFailure(Throwable throwable) {
        view.onReposLoadedFailure(throwable);
    }
}
