package com.test.ecommerce;

import android.app.Application;

import timber.log.Timber;

/**
 * Base application
 *
 * @author Shadab Mallick
 */
public class BaseApplication extends Application
{
    private AppComponent appComponent;

    @Override
    public void onCreate()
    {
        super.onCreate();

        if (BuildConfig.DEBUG)
        {
            Timber.plant(new Timber.DebugTree());
        }

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();

        appComponent.inject(this);
    }

    public AppComponent getAppComponent()
    {
        return appComponent;
    }
}
