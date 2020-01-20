package com.test.ecommerce.domain.categorylist;

import com.test.ecommerce.domain.categorylist.adapter.CategoryGroup;
import com.test.ecommerce.model.response.CategoryDTO;

import java.util.List;

/**
 * Contract for view and presenter
 *
 * @author Shadab Mallick
 */
public interface Contracts
{

    interface View
    {
        void initView();

        void populateData(List<CategoryDTO> categoryDTOList);

        void onCategoryItemSelected(CategoryDTO category);

        void onError(Throwable throwable);

        void showLoading();

        void hideLoading();

        void populateSubCategories(List<CategoryGroup> categoryGroups);
    }

    interface Presenter
    {
        void init();

        void fetchCategoryAndProductData();

        void showLoading();

        void hideLoading();
        void onDetach();

    }
}
