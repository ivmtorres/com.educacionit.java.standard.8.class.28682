
package com.educationit.java.standard.integrator.beans;


import java.time.LocalDate;

public class Teacher extends Person {


    private Course[] coursesCurrently;

    private Course[] coursesAvailables;


    public Teacher (String name, String lastName, String email,
                    boolean enabled, LocalDate birthDay, Course[] coursesCurrently,
                    Course[] coursesAvailables) {


        super (name, lastName, email,
                false, LocalDate.now ());

        this.coursesCurrently = coursesCurrently;
        this.coursesAvailables  = coursesAvailables;
    }


    public Course[] getCoursesCurrently() {
        return coursesCurrently;
    }

    public void setCoursesCurrently(Course[] coursesCurrently) {
        this.coursesCurrently = coursesCurrently;
    }

    public Course[] getCoursesAvailables() {
        return coursesAvailables;
    }

    public void setCoursesAvailables(Course[] coursesAvailables) {
        this.coursesAvailables = coursesAvailables;
    }
}