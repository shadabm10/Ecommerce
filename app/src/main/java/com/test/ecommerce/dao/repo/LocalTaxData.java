package com.test.ecommerce.dao.repo;

import com.test.ecommerce.database.AppDatabase;
import com.test.ecommerce.model.roomentities.Tax;

import java.util.List;

import javax.inject.Inject;
/**
 * local data source.
 * @author Shadab Mallick
 */
public class LocalTaxData implements DataSource<Tax>
{

    AppDatabase appDatabase;

    @Inject
    public LocalTaxData(AppDatabase appDatabase)
    {
        this.appDatabase = appDatabase;
    }

    @Override
    public void addItem(Tax tax)
    {
        appDatabase.taxDataDao().insert(tax);
    }

    @Override
    public void addItems(List<Tax> items)
    {

    }
}
