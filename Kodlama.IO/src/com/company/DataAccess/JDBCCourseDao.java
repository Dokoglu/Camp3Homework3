package com.company.DataAccess;

import com.company.entities.Course;

public class JDBCCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
