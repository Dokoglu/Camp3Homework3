package com.company.business;

import com.company.DataAccess.CategoryDao;
import com.company.coreLogging.ILogger;
import com.company.entities.Category;

import java.util.List;

public class CategoryManager {

    private CategoryDao categoryDao;
    private List<Category> categories;
    private ILogger[] loggers;


    public  CategoryManager(CategoryDao categoryDao, List<Category> categories, ILogger [] loggers){
        this.categoryDao=categoryDao;
        this.categories=categories;
        this.loggers=loggers;
    }
    public void add(Category category) throws Exception {

        for (Category ct: categories){
            if (ct.getName().equals(ct.getName())){
                throw  new Exception("Aynı isme sahip kategori olamaz");
            }
        }
        categoryDao.add(category);

    }
}
