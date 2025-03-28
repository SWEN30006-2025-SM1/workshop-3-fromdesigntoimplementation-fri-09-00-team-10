package com.unimelb.swen30006.workshops;

public class Student extends Person{
    private String email;
    private String studentID;
    public Student(String name, String address, String dob){
        super(name, address, dob);
        this.email = name;
        this.studentID = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public float totalGrade(){
        return 85.0f;
    }

    public void sendEmailMsg(){
        System.out.println("Sending email to " + email);
    }
}
