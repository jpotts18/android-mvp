package io.jpotts18.android_mvp.domain.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.jpotts18.android_mvp.BuildConfig;
import io.jpotts18.android_mvp.R;
import io.jpotts18.android_mvp.domain.login.ILoginView;
import io.jpotts18.android_mvp.domain.login.LoginPresenter;


public class LoginActivity extends ActionBarActivity implements ILoginView {

    /******************************************************************************************
     - LoginActivity ONLY knows how to display views and sending events and data to the presenter
     - LoginActivity doesn't know anything about the model (SynchronousLoginInteractor)
     - The only changes to the LoginActivity to allow for asynchronous behavior was to add a ProgressDialog
    ********************************************************************************************
    */

    @Bind(R.id.login_email_edit_text)
    EditText emailEditText;

    @Bind(R.id.login_password_edit_text)
    EditText passwordEditText;

    LoginPresenter presenter;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        if (BuildConfig.DEBUG) {
            emailEditText.setText("anthing@gmail.com");
            passwordEditText.setText("$uper$ecret");
        }

        // #1 Give your Presenter a reference to the View here
        presenter = new LoginPresenter(this);
    }

    @OnClick(R.id.login_submit_button)
    public void loginTapped(View view){
        progressDialog = ProgressDialog.show(this, "Authenticating...", null);
        String email =  emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();
        // Pass user event straight to presenter
        presenter.attemptLogin(email, password);
    }

    @Override
    public void navigateToListActivity() {
        progressDialog.dismiss();
        Toast.makeText(this, "Login Success!",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailed() {
        progressDialog.dismiss();
        Toast.makeText(this, "Login Invalid: Use a gmail address", Toast.LENGTH_SHORT).show();
    }
}



