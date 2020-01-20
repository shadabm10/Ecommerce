package com.test.ecommerce;

import com.test.ecommerce.api.ApiModule;
import com.test.ecommerce.domain.cartdetails.CartComponent;
import com.test.ecommerce.domain.cartdetails.CartModule;
import com.test.ecommerce.domain.categorylist.CategoryComponent;
import com.test.ecommerce.domain.categorylist.CategoryModule;
import com.test.ecommerce.domain.productdetails.ProductDetailComponent;
import com.test.ecommerce.domain.productdetails.ProductDetailModule;
import com.test.ecommerce.domain.productlist.ProductListComponent;
import com.test.ecommerce.domain.productlist.ProductListModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * App component
 *
 * @author Shadab Mallick
 */
@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent
{
    void inject(BaseApplication baseApplication);

    CategoryComponent newCategoryComponent(CategoryModule categoryModule);

    ProductListComponent newProductListComponent(ProductListModule categoryModule);

    ProductDetailComponent newProductDetailComponent(ProductDetailModule categoryModule);

    CartComponent newCartComponent(CartModule cartModule);
}