package com.example.SpringBootstart.unautoMbatis.bean;

import java.io.Serializable;

public class TnTeacher implements Serializable {  
    /** 
     *  
     */  
    private static final long serialVersionUID = 7338482884226735533L;  
    private Integer id;  
    private String teaName;  
    private Integer teaAge;  
      
      
    public TnTeacher(String teaName, Integer teaAge) {  
        super();  
        this.teaName = teaName;  
        this.teaAge = teaAge;  
    }  
    public Integer getId() {  
        return id;  
    }  
    public void setId(Integer id) {  
        this.id = id;  
    }  
    public String getTeaName() {  
        return teaName;  
    }  
    public void setTeaName(String teaName) {  
        this.teaName = teaName;  
    }  
    public Integer getTeaAge() {  
        return teaAge;  
    }  
    public void setTeaAge(Integer teaAge) {  
        this.teaAge = teaAge;  
    }  
      
}  