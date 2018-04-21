
package com.educationit.java.standard.integrator.beans;


import java.time.LocalDate;


public class Student extends Person {


    private LocalDate birthDay;

    private Course[] courses;


    public Student (String name, String lastName, String email,
                    boolean enabled, LocalDate birthDay, Course[] courses) {


        super (name, lastName, email,
                false, LocalDate.now ());

        this.birthDay = birthDay;
        this.courses  = courses;
    }


    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
