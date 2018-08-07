package com.example.SpringBootstart.unautoMbatis.bean;

import java.io.Serializable;

public class TnStudent implements Serializable {  
    /** 
     *  
     */  
    private static final long serialVersionUID = 4265173931263772442L;  
    private Integer id;  
    private String name;  
    private Integer age;  
      
    public TnStudent(String name, Integer age) {  
        super();  
        this.name = name;  
        this.age = age;  
    }  
    public Integer getId() {  
        return id;  
    }  
    public void setId(Integer id) {  
        this.id = id;  
    }  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public Integer getAge() {  
        return age;  
    }  
    public void setAge(Integer age) {  
        this.age = age;  
    }  
      
}  