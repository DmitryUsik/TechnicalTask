package com.riseapps.practicaltask.ui;

import android.os.Bundle;

import com.riseapps.practicaltask.R;
import com.riseapps.practicaltask.ui.base.BaseActivity;

public class MainActivity extends BaseActivity implements MainView {
    private final MainPresenter mainPresenter = new MainPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter.setView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainPresenter.setView(null);
    }
}