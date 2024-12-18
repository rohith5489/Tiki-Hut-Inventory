package com.rohithdev.TikiHutInventory.services;

import com.rohithdev.TikiHutInventory.dtos.CategoryDTO;
import com.rohithdev.TikiHutInventory.dtos.Response;

public interface CategoryService {

    Response createCategory(CategoryDTO categoryDTO);

    Response getAllCategories();

    Response getCategoryById(Long id);

    Response updateCategory(Long id, CategoryDTO categoryDTO);

    Response deleteCategory(Long id);
}

