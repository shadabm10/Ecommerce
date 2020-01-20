package com.test.ecommerce;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;

/**
 * base toolbar activity
 *
 * @author  Shadab Mallick
 */
public abstract class BaseToolBarActivity extends BaseActivity
{

    private FrameLayout contentFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_base_toolbar);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        contentFrame = findViewById(R.id.activity_content);
    }

    @Override
    public void setContentView(int layoutResId)
    {
        getLayoutInflater().inflate(layoutResId, contentFrame, true);
    }
}
