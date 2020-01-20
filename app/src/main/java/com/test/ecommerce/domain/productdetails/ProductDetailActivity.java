package com.test.ecommerce.domain.productdetails;

import android.os.Bundle;
import android.view.Menu;

import com.test.ecommerce.BaseToolBarActivity;
import com.test.ecommerce.R;
import com.test.ecommerce.model.roomentities.relation.ProductDetails;
import com.test.ecommerce.util.ActivityUtil;

/**
 * This activity shows the product details.
 *
 * This is in all separate module which may need to call from various places.
 *
 * @author Shadab Mallick
 */
public class ProductDetailActivity extends BaseToolBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ProductDetails productDetails = getIntent().getExtras().getParcelable(ProductDetailFragment.PARAM_PRODUCT_DETAIL);

        ActivityUtil.replaceFragment(this, null, ProductDetailFragment.newInstance(productDetails), false, R.id.content_frame);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.app_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        if (getSupportActionBar() != null)
            getSupportActionBar().setTitle(R.string.product_details);
    }
}
