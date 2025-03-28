package com.unimelb.swen30006.workshops;

public class Subject {
    private String name;
    private String subjectCode;

    public Subject subject(String name,String subjectCode){
        this.name=name;
        this.subjectCode=subjectCode;
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void createAssignment(Assignment assignment){

    }
    public void deleteAssignment(String staffID,Assignment assignment){

    }
}
