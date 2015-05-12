package io.jpotts18.android_mvp.domain.ui;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import butterknife.ButterKnife;
import butterknife.InjectView;
import io.jpotts18.android_mvp.R;


public class LoginActivity extends ActionBarActivity {

    @InjectView(R.id.login_email_edit_text)
    EditText loginEditText;

    @InjectView(R.id.login_password_edit_text)
    EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.inject(this);
    }

}



