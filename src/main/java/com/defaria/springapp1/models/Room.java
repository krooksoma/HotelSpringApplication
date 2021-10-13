package com.defaria.springapp1.models;

public class Room implements BaseEntity{
    private long id;
    private String name, type, details;

    public Room() {
    }

    public Room(long id, String name, String type, String details) {
        this.id = id;
        this.name = name;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
