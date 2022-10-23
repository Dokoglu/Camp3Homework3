package com.company.business;

import com.company.DataAccess.CourseDao;
import com.company.DataAccess.HibernateCourseDao;
import com.company.coreLogging.ILogger;
import com.company.entities.Course;

import java.util.List;
import java.util.logging.Logger;

public class CourseManager {

    private CourseDao courseDao;
    private List<Course> courses;
    private ILogger[] loggers;


    public CourseManager(CourseDao courseDao, List<Course> courses,ILogger[] logger){
        this.courseDao=courseDao;
        this.courses=courses;
        this.loggers=logger;
    }



    public void add(Course course) throws Exception {
       if (course.getPrice()<0){
           throw new Exception("Kurs fiyatı negatif olamaz");
       }
       for (Course c: courses){
           if (c.getName().equals(course.getName())){
               throw new Exception("Aynı isimde kurs olamaz");
           }
       }

       courseDao.add(course);

       for (ILogger logger: loggers){
           logger.log(course.getName());
       }
        
    }
}
