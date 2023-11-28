package org.example;

import lombok.AllArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
public class Course {
    private static int nextId = 1;
    private String courseId;
    private double credit;
    private Student[] students;
    private Teacher teacher;
    private String[] registeredStudents = new String[5];

    public Course(String courseId, String[] registeredStudents, double credit, Teacher teacher, Student student) {
        this.courseId = courseId;
        this.credit = credit;
        this.registeredStudents = registeredStudents;
        this.students = students;
        this.teacher = teacher;
    }
    public Course(String courseName, double credit, Departement department){
        this.courseId = "C" + String.format("%03d", nextId++);
    }

    public String[] getRegisteredStudents() {
        return registeredStudents;
    }

    public void setRegisteredStudents(String[] registeredStudents) {
        this.registeredStudents = registeredStudents;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Course.nextId = nextId;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", credit=" + credit +
                ", students=" + Arrays.toString(students) +
                ", teacher=" + teacher +
                ", registeredStudents=" + Arrays.toString(registeredStudents) +
                '}';
    }
}
