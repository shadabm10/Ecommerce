package com.test.ecommerce.domain.categorylist;

import com.test.ecommerce.api.ApiService;
import com.test.ecommerce.dao.repo.Repository;

import dagger.Module;
import dagger.Provides;

/**
 * Category module.
 *
 * @author Shadab Mallick
 */
@Module
public class CategoryModule
{
    private final Contracts.View categoryView;

    public CategoryModule(Contracts.View categoryView)
    {
        this.categoryView = categoryView;
    }

    @Provides
    @CategoryScope
    CategoryListPresenter provideCategoryListPresenter(ApiService apiService, Repository repository)
    {
        return new CategoryListPresenter(categoryView, apiService,repository);
    }
}
