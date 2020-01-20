package com.test.ecommerce.model.roomentities.relation;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import com.test.ecommerce.model.roomentities.Product;
import com.test.ecommerce.model.roomentities.Variant;

import java.util.List;

/**
 * Product and variant
 *
 * @author Shadab Mallick
 */
public class ProductAndVariant
{
    @Embedded
    public Product product;

    @Relation(parentColumn = "id", entityColumn = "product_id")
    public List<Variant> variants;
}
