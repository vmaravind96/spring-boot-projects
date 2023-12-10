package com.aravind.lil.learningspring;

public class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName){
        super();
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
