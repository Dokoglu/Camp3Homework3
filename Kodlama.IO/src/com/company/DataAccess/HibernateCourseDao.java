package com.company.DataAccess;

import com.company.entities.Course;

public class HibernateCourseDao implements  CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile  veritabanına eklendi");
    }
}
