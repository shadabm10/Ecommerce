package com.test.ecommerce.dao.repo;

import com.test.ecommerce.database.AppDatabase;
import com.test.ecommerce.model.roomentities.ParentChildCategoryMapping;

import java.util.List;

import javax.inject.Inject;

/**
 * local data source.
 * @author Shadab Mallick
 */
public class LocalParentChildCategoryMappingData implements DataSource<ParentChildCategoryMapping>
{

    AppDatabase appDatabase;

    @Inject
    public LocalParentChildCategoryMappingData(AppDatabase appDatabase)
    {
        this.appDatabase = appDatabase;
    }

    @Override
    public void addItem(ParentChildCategoryMapping parentChildCategoryMapping)
    {
        appDatabase.parentChildCategoryMappingDataDao().insert(parentChildCategoryMapping);
    }

    @Override
    public void addItems(List<ParentChildCategoryMapping> items)
    {
    }
}
