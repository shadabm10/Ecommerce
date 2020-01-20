package com.test.ecommerce.domain.productlist;

import android.os.Bundle;
import android.view.Menu;

import com.test.ecommerce.BaseToolBarActivity;
import com.test.ecommerce.R;
import com.test.ecommerce.model.response.CategoryDTO;
import com.test.ecommerce.util.ActivityUtil;

/**
 * This activity shows the product list.
 * This is in all separate module which may need to call from various places.
 *
 * @author Shadab Mallick
 */
public class ProductListActivity extends BaseToolBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        CategoryDTO categoryDTO = getIntent().getExtras().getParcelable(ProductListFragment.STR_CATEGORY);

        ActivityUtil.replaceFragment(this, null, ProductListFragment.newInstance(categoryDTO), false, R.id.content_frame);
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
            getSupportActionBar().setTitle(R.string.product_list);
    }
}
