package com.test.ecommerce.domain.productdetails;

import com.test.ecommerce.model.response.VariantDTO;
import com.test.ecommerce.model.roomentities.relation.ProductDetails;

import java.util.ArrayList;

/**
 * Contract for view and presenter
 *
 * @author Shadab Mallick
 */
public interface Contracts
{

    interface View
    {
        void initView();

        void onError(Throwable throwable);

        void showLoading();

        void hideLoading();

        void onSuccess();

        void onVariantSelected(VariantDTO variantDTO);

        void onVariantFetched(ArrayList<VariantDTO> variants);

        void onAddError(Throwable e);
    }

    interface Presenter
    {
        void init();

        void showLoading();

        void hideLoading();

        void addtoCart(ProductDetails productDetails);
        void onDetach();

    }
}
