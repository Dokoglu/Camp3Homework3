package com.company;

import com.company.DataAccess.*;
import com.company.business.CategoryManager;
import com.company.business.CourseManager;
import com.company.coreLogging.DatabaseLogger;
import com.company.coreLogging.FileLogger;
import com.company.coreLogging.ILogger;
import com.company.coreLogging.MailLogger;
import com.company.entities.Category;
import com.company.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here

        Course course1=new Course(3802847,"Matematik",16,3);
        Course course2=new Course(4820494,"Matematik", 35,2);
        List<Course> courses=new ArrayList<>();
        List<Category>categories=new ArrayList<>();

        ILogger[] loggers={new FileLogger(), new DatabaseLogger(), new MailLogger()};

        CourseManager courseManager1=new CourseManager(new JDBCCourseDao(),courses, loggers);
        courses.add(course1);
        courses.add(course2);

        Category category1=new Category(3820294,"MOBİL Programlama");
        Category category2=new Category(5542828,"MOBİL Programlama");

        CategoryManager categoryManager=new CategoryManager(new HibernateCategoryDao(),categories,loggers);
        categoryManager.add(category1);
        categoryManager.add(category2);
    }




}
