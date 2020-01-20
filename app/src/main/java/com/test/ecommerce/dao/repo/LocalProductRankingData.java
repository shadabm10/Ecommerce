package com.test.ecommerce.dao.repo;

import com.test.ecommerce.database.AppDatabase;
import com.test.ecommerce.model.roomentities.ProductRanking;

import java.util.List;

import javax.inject.Inject;
/**
 * local data source.
 * @author Shadab Mallick
 */
public class LocalProductRankingData implements DataSource<ProductRanking>
{

    AppDatabase appDatabase;

    @Inject
    public LocalProductRankingData(AppDatabase appDatabase)
    {
        this.appDatabase = appDatabase;
    }

    @Override
    public void addItem(ProductRanking productRanking)
    {
        appDatabase.productRankingDataDao().insert(productRanking);
    }

    @Override
    public void addItems(List<ProductRanking> items)
    {

    }
}
