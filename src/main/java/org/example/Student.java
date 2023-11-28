package org.example;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Arrays;
@AllArgsConstructor
public class Student {
    private static int nextId = 1;
    private String studentId;
    private String fname;
    private String lname;
    private String[] registeredCourses = new String[5];

    public Student(String studentId) {
        this.studentId = studentId;
    }
    public Student(){
        this.studentId = "S" + String.format("%03d",nextId++);
        this.fname = new String(fname);
        this.lname = new String(lname);
        this.registeredCourses = new String[5];
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String[] getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(String[] registeredCourses) {
        this.registeredCourses = registeredCourses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", registeredCourses=" + Arrays.toString(registeredCourses) +
                '}';
    }
}
