package com.test.ecommerce.domain.productlist;

import com.test.ecommerce.dao.repo.Repository;

import dagger.Module;
import dagger.Provides;

/**
 * Product list module
 *
 * @author Shadab Mallick
 */
@Module
public class ProductListModule
{

    private final Contracts.View productListView;

    public ProductListModule(Contracts.View productListView)
    {
        this.productListView = productListView;
    }

    @Provides
    @ProductListScope
    ProductListPresenter provideProductListPresenter( Repository repository)
    {
        return new ProductListPresenter(productListView, repository);
    }
}
