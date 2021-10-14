package com.defaria.springapp1.models;

import javax.persistence.*;

@Entity
@Table(name="ROOM")
public class Room implements BaseEntity{

    @Id
    @Column(name="ROOM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="ROOM_NUMBER")
    private String number;
    @Column(name="NAME")
    private String name;
    @Column(name="BED_INFO")
    private String details;

    public Room() {
    }

    public Room(long id, String name, String number, String details) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.details = details;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String type) {
        this.number = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public long id() {
        return 0;
    }

    @Override
    public String name() {
        return null;
    }
}
