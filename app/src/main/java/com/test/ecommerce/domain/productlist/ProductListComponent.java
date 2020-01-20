package com.test.ecommerce.domain.productlist;

import dagger.Subcomponent;


/**
 * Created by Shadab Mallick
 * Custom scope for product list screen, this is a child component of App Component
 * and needs to be smaller in size
 */
@ProductListScope
@Subcomponent(modules = {ProductListModule.class})
public interface ProductListComponent
{
    void inject(ProductListFragment productListFragment);
}