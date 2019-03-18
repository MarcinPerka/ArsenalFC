package com.archu.arsenalfc.model;

public class Player {

    private String position;
    private String name;
    private String country;
    private int age;
    private String imgId;

    public Player(String position, String name, String country, int age, String imgId) {
        this.position = position;
        this.name = name;
        this.country = country;
        this.age = age;
        this.imgId = imgId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId;
    }
}
