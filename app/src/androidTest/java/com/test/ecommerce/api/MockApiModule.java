package com.test.ecommerce.api;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Shadab Mallick
 */
@Module
public class MockApiModule
{

    @Provides
    @Singleton
    ApiService providesApiService()
    {
        return new MockApiService();
    }
}
