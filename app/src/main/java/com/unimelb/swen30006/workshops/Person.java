package com.unimelb.swen30006.workshops;

import java.util.Date;
import java.lang.String;

public abstract class Person {
    private String address;
    private String dob;
    private String name;
    public Person(String name, String address, String dob) {
        this.name = name;
        this.address = address;
        this.dob =dob;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
