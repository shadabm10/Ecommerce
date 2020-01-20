package com.test.ecommerce.dao.repo;

import java.util.List;

/**
 * @author Shadab Mallick
 * Base datasource
 * @param <T>
 */
public interface DataSource<T>
{

    void addItem(T item);

    void addItems(List<T> items);


}
