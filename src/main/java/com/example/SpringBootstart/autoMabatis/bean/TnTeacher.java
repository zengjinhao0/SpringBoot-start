package com.example.SpringBootstart.autoMabatis.bean;

public class TnTeacher {
    private Integer id;

    private String tea_name;

    private Integer tea_age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTea_name() {
        return tea_name;
    }

    public void setTea_name(String tea_name) {
        this.tea_name = tea_name == null ? null : tea_name.trim();
    }

    public Integer getTea_age() {
        return tea_age;
    }

    public void setTea_age(Integer tea_age) {
        this.tea_age = tea_age;
    }
}