package com.test.ecommerce.dao.repo;

import com.test.ecommerce.database.AppDatabase;
import com.test.ecommerce.model.roomentities.Cart;
import com.test.ecommerce.model.roomentities.relation.CartDetail;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

/**
 * local data source.
 * @author Shadab Mallick
 */
public class LocalCartData implements DataSource<Cart>
{

    AppDatabase appDatabase;

    @Inject
    public LocalCartData(AppDatabase appDatabase)
    {
        this.appDatabase = appDatabase;
    }

    @Override
    public void addItem(Cart cart)
    {
        appDatabase.cartDao().insert(cart);
    }

    @Override
    public void addItems(List<Cart> cartList)
    {

    }

    public Single<List<CartDetail>> getCartDetails()
    {
        return appDatabase.cartDao().getCartDetails();
    }

    public void removeFromCart(int cartId)
    {
        appDatabase.cartDao().removeFromCart(cartId);
    }
}
