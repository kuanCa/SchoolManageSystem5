package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Teacher {
    private static int nextId = 1;
    private String departmentId;
    private String teacherId;
    private Departement departement;
    private String lname;
    private String fname;

    public Teacher(String firstName, String lastName, String departmentId) {
        this.teacherId = new String(teacherId); // Generate a unique teacherId
        this.fname = new String(fname);
        this.lname = lastName;
        this.departmentId = departmentId;
    }
    public Teacher(){
        this.teacherId = "T" + String.format("%03d", nextId++);
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Teacher.nextId = nextId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "departmentId='" + departmentId + '\'' +
                ", teacherId='" + teacherId + '\'' +
                ", departement=" + departement +
                ", lname='" + lname + '\'' +
                ", fname='" + fname + '\'' +
                '}';
    }
}
