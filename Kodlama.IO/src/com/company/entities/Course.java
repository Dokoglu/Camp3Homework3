package com.company.entities;

public class Course {

    private int id;
    private String name;
    private double price;
    private int number_ofInstructor;

    public Course(int id, String name, double price, int number_ofInstructor){
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
        this.setNumber_ofInstructor(number_ofInstructor);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber_ofInstructor() {
        return number_ofInstructor;
    }

    public void setNumber_ofInstructor(int number_ofInstructor) {
        this.number_ofInstructor = number_ofInstructor;
    }
}
