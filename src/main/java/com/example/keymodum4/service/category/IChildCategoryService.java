package com.example.keymodum4.service.category;

import com.example.keymodum4.model.ChildCategory;
import com.example.keymodum4.model.ExpenseCategory;
import com.example.keymodum4.model.ParentCategory;
import com.example.keymodum4.service.GeneralService;

public interface IChildCategoryService extends GeneralService<ChildCategory> {
    Iterable<ExpenseCategory> showExpenseCategories();
    Iterable<ChildCategory> findAllByParentCategory(ParentCategory parentCategory);

}
