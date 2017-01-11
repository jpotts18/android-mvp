package io.jpotts18.android_mvp.domain.ui;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.jpotts18.android_mvp.R;


public class LoginActivity extends ActionBarActivity {

    @BindView(R.id.login_github_username)
    EditText loginEditText;

    @BindView(R.id.login_fake_password)
    EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

}



