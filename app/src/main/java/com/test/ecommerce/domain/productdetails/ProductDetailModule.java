package com.test.ecommerce.domain.productdetails;

import com.test.ecommerce.dao.repo.Repository;

import dagger.Module;
import dagger.Provides;

/**
 * Product detail module
 *
 * @author Shadab Mallick
 */
@Module
public class ProductDetailModule
{

    private final Contracts.View productListView;

    public ProductDetailModule(Contracts.View productListView)
    {
        this.productListView = productListView;
    }

    @Provides
    @ProductDetailScope
    ProductDetailPresenter provideProductDetailPresenter(Repository repository)
    {
        return new ProductDetailPresenter(productListView, repository);
    }
}
