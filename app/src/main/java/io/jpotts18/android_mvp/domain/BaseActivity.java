package io.jpotts18.android_mvp.domain;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

import butterknife.ButterKnife;
import io.jpotts18.android_mvp.R;


/**
 * Created by John on 10/17/2017.
 */

public class BaseActivity extends AppCompatActivity {
    static final String TAG = BaseActivity.class.getName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initLogger(TAG);
        Logger.i("onCreate");

        if (savedInstanceState != null) {

        }
    }

    public void initLogger(String TAG) {
        Logger.clearLogAdapters();
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(false)  // (Optional) Whether to show thread info or not. Default true
                .methodCount(2)         // (Optional) How many method line to show. Default 2
                .methodOffset(2)        // (Optional) Skips some method invokes in stack trace. Default 5
                .tag(TAG)   // (Optional) Custom tag for each log. Default PRETTY_LOGGER
                .build();
        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy));
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
          super.onActivityResult(requestCode, resultCode, data);
    }

    protected void setupToolbar(final String title) {
        setupToolbar(title, false);
    }

    protected Toolbar getToolbar() {
        return (Toolbar) findViewById(R.id.main_toolbar);
    }

    protected void setupToolbar(final String title, final boolean enableUpNavigation) {
        final Toolbar toolbar = getToolbar();
        if (toolbar == null) {
            return;
        }
        toolbar.setTitleTextAppearance(this, R.style.AppTheme);
        toolbar.setTitle(title);
        setSupportActionBar(toolbar);
        if (enableUpNavigation) {
            toolbar.setNavigationIcon(R.drawable.ic_action_name);
        }

    }

    @Override
    public  void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.setDebug(true);
        ButterKnife.bind(this);
    }


}
