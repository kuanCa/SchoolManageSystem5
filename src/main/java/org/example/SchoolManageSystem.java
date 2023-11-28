package org.example;

public class SchoolManageSystem {
    private Departement[] departements = new Departement[5];//MAx 5 departements
    private Student[] students = new Student[200];//Max 200 students
    private Teacher[] teachers = new Teacher[20];//Max 20 teachers
    private Course[] courses = new Course[30];//Max 30 courses

    public void addDepartment(String departmentName) {
        Departement newDepartment = new Departement(departmentName);
        // Add logic to add the new department to the departments array
    }

    // Method to add a new student
    public void addStudent(String firstName, String lastName, String departmentId) {
        // Assuming you have a method to search for a department based on its ID
        Departement department = searchDepartement(departmentId);
        if (department != null) {
            Student newStudent = new Student(firstName, lastName, department);
            // Add logic to add the new student to the students array
        } else {
            System.out.println("Department not found.");
        }
    }

    // Method to add a new teacher
    public void addTeacher(String firstName, String lastName, String departmentId) {
        // Assuming you have a method to search for a department based on its ID
        Departement department = searchDepartement(departmentId);
        if (department != null) {
            Teacher newTeacher = new Teacher(firstName, lastName, departmentId);
            // Add logic to add the new teacher to the teachers array
        } else {
            System.out.println("Department not found.");
        }
    }

    // Method to add a new course
    public void addCourse(String courseName, double credit, String departmentId) {
        // Assuming you have a method to search for a department based on its ID
        Departement department = searchDepartement(departmentId);
        if (department != null) {
            Course newCourse = new Course(courseName, credit, department);
            // Add logic to add the new course to the courses array
        } else {
            System.out.println("Can not find Departement");
        }
    }

    private Departement searchDepartement(String departmentId) {
        return null;
    }
}
