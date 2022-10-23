package com.company.entities;

public class Instructor {

    private String firstName;
    private String lastName;
    private String lectureName;

    public Instructor(String firstName, String lastName, String lectureName){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setLectureName(lectureName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }
}
