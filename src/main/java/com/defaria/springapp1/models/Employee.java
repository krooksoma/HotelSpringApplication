package com.defaria.springapp1.models;

public class Employee implements BaseEntity{
   private long id;
   private String firstName, lastName, position;

    public Employee() {
    }

    public Employee(long id, String firstName, String lastName, String position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public long id() {
        return 0;
    }

    @Override
    public String name() {
        return this.getLastName() + " " + this.getFirstName();
    }
}
