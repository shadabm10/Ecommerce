package com.test.ecommerce.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.test.ecommerce.dao.CartDao;
import com.test.ecommerce.dao.CategoryDao;
import com.test.ecommerce.dao.ParentChildCategoryMappingDao;
import com.test.ecommerce.dao.ProductDao;
import com.test.ecommerce.dao.ProductRankingDao;
import com.test.ecommerce.dao.ProductTaxDao;
import com.test.ecommerce.dao.TaxDao;
import com.test.ecommerce.dao.VariantDao;
import com.test.ecommerce.model.roomentities.Cart;
import com.test.ecommerce.model.roomentities.Category;
import com.test.ecommerce.model.roomentities.ParentChildCategoryMapping;
import com.test.ecommerce.model.roomentities.Product;
import com.test.ecommerce.model.roomentities.ProductRanking;
import com.test.ecommerce.model.roomentities.ProductTax;
import com.test.ecommerce.model.roomentities.Tax;
import com.test.ecommerce.model.roomentities.Variant;

/**
 * Room database for storing api response data.
 *
 * @author Shadab Mallick
 */
@Database(entities = {Category.class, Product.class, Tax.class, Variant.class, ProductTax.class,
        ProductRanking.class, ParentChildCategoryMapping.class, Cart.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase
{
    public abstract CategoryDao categoryDataDao();

    public abstract ProductDao productDataDao();

    public abstract TaxDao taxDataDao();

    public abstract VariantDao variantDataDao();

    public abstract ProductTaxDao productTaxDataDao();

    public abstract ProductRankingDao productRankingDataDao();

    public abstract ParentChildCategoryMappingDao parentChildCategoryMappingDataDao();

    public abstract CartDao cartDao();
}
