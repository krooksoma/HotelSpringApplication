package com.defaria.springapp1.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="EMPLOYEE")
public class Employee implements BaseEntity{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private String id;
   @Column(name="FIRST_NAME")
   private String firstName;
   @Column(name="LAST_NAME")
   private String lastName;
//   can store the enum on the database, then retrieve and cast in the applications
   @Column(name="POSITION")
   @Enumerated(EnumType.STRING)
   private Position position;

    public Employee() {
        this.id = UUID.randomUUID().toString();
    }

    public Employee(String id, String firstName, String lastName, Position position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
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
