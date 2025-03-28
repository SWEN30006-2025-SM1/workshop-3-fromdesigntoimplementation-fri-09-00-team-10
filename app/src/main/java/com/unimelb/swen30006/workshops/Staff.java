package com.unimelb.swen30006.workshops;

public class Staff extends Person{
    private String[] roles;
    private String staffID;
    public Staff(String name, String address, String dob, String[] roles, String staffID){
        super(name, address, dob);
        this.roles = roles;
        this.staffID = staffID;
    }

    public String[] getRoles(){
        return roles;
    }

    public String getStaffID(){
        return staffID;
    }

    public void setRoles(String[] roles){
        this.roles = roles;
    }

    public void setStaffID(String staffID){
        this.staffID = staffID;
    }
}
