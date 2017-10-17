package io.jpotts18.android_mvp.domain.loggin.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import com.orhanobut.logger.Logger;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.jpotts18.android_mvp.BuildConfig;
import io.jpotts18.android_mvp.R;
import io.jpotts18.android_mvp.R2;
import io.jpotts18.android_mvp.domain.BaseActivity;
import io.jpotts18.android_mvp.domain.loggin.LoginContract;
import io.jpotts18.android_mvp.domain.loggin.LoginListPresenter;


public class LoginActivity extends BaseActivity implements LoginContract.View {

    /******************************************************************************************
     - LoginActivity ONLY knows how to display views and sending events and data to the presenter
     - LoginActivity doesn't know anything about the model (SynchronousLoginInteractor)
     - The only changes to the LoginActivity to allow for asynchronous behavior was to add a ProgressDialog
    ********************************************************************************************
    */
    static final String TAG = LoginActivity.class.getName();
    @NonNull @BindView(R2.id.login_pipedrive_username) EditText githubUsernameEditText;
    @NonNull @BindView(R2.id.login_pipedrive_password) EditText fakePasswordEditText;

    LoginListPresenter presenter;
    ProgressDialog progressDialog;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setupToolbar(getString(R.string.app_name));

        if (BuildConfig.DEBUG) {
            ButterKnife.setDebug(true);
            githubUsernameEditText.setText("dreamcodesoft@gmail.com");
            fakePasswordEditText.setText("Blaster1311");
        }
        presenter = new LoginListPresenter(this);
        Logger.i("presenter init");
    }

    @OnClick(R2.id.login_submit_button)
    public void loginTapped(View view){
        progressDialog = ProgressDialog.show(this, "Authenticating...", null);
        String email =  githubUsernameEditText.getText().toString();
        String password = fakePasswordEditText.getText().toString();
        // Pass user event straight to presenter
        Logger.i("Button clicked");
        presenter.authenticateUser(email, password);

        //Logger.d("loginTapped");
    }

    @Override
    public void showLoadingIndicator(boolean active) {
        progressDialog = ProgressDialog.show(this, "Loading...", null);
    }

    @Override
    public void showLoginError(Throwable throwable) {
        progressDialog.dismiss();
        Toast.makeText(this, throwable.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
        //Logger.d("loginTapped");
    }

    @Override
    public void navigateToPersonListActivity() {
        progressDialog.dismiss();
        Toast.makeText(this, "Login Success!",Toast.LENGTH_SHORT).show();
        // TODO: This seems to have to do with persisting data. Where should we move this?
        //Intent i = new Intent(this, RepoListFragmentActivity.class);
       // i.putExtra("username", githubUsernameEditText.getText().toString());
       // startActivity(i);
    }

}



