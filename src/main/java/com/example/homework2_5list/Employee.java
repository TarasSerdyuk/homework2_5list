package com.example.homework2_5list;

public class Employee {
    private  String lastName;
    private String firstName;


    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;

    }


    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
