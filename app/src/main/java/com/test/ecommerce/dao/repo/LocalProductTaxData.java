package com.test.ecommerce.dao.repo;

import com.test.ecommerce.database.AppDatabase;
import com.test.ecommerce.model.roomentities.ProductTax;

import java.util.List;

import javax.inject.Inject;
/**
 * local data source.
 * @author Shadab Mallick
 */
public class LocalProductTaxData implements DataSource<ProductTax>
{

    AppDatabase appDatabase;

    @Inject
    public LocalProductTaxData(AppDatabase appDatabase)
    {
        this.appDatabase = appDatabase;
    }

    @Override
    public void addItem(ProductTax productTax)
    {
        appDatabase.productTaxDataDao().insert(productTax);
    }

    @Override
    public void addItems(List<ProductTax> items)
    {
    }
}
