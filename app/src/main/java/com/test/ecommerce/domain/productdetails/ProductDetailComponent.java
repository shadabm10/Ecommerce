package com.test.ecommerce.domain.productdetails;

import dagger.Subcomponent;


/**
 * Created by Shadab Mallick
 * Custom scope for product detail screen, this is a child component of App Component
 * and needs to be smaller in size
 */
@ProductDetailScope
@Subcomponent(modules = {ProductDetailModule.class})
public interface ProductDetailComponent
{
    void inject(ProductDetailFragment productDetailFragment);
}