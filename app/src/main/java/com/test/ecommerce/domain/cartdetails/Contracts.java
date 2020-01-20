package com.test.ecommerce.domain.cartdetails;

import com.test.ecommerce.model.CartSummary;
import com.test.ecommerce.model.roomentities.relation.CartDetail;

import java.util.List;

/**
 * Contract for view and presenter
 *
 * @author Shadab Mallick
 */
interface Contracts
{

    interface View
    {
        void initView();

        void populateData(List<CartDetail> categoryDTOList, CartSummary cartSummary);

        void onError(Throwable throwable);

        void showLoading();

        void hideLoading();

        void removeFromCart(CartDetail cartDetail);

        void productRemoved();
    }

    interface Presenter
    {
        void init();

        void fetchCartProductDetails();

        void showLoading();

        void hideLoading();

        void onDetach();
    }
}
