package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SchoolManageSystem SSystem = new SchoolManageSystem();

        SSystem.addDepartment("MATH");
        SSystem.addDepartment("Science");
        SSystem.addDepartment("ComputerScience");
        SSystem.addStudent("Kuan", "Cao", "D003");
        SSystem.addCourse("MATH", 4, "D003");
        SSystem.addTeacher("WWW", "YYY", "D001");
        //Adding department, student, course and teachers

        System.out.println("Departments:");
        SSystem.displayDepartments();

        System.out.println("\nStudents:");
        SSystem.displayStudents();

        System.out.println("\nTeachers:");
        SSystem.displayTeachers();

        System.out.println("\nCourses:");
        SSystem.displayCourses();

        System.out.println("\nSearching for a department:");
        Departement foundDept = SSystem.searchDepartment("D011");
        System.out.println(foundDept != null ? foundDept : "Department not found.");

        System.out.println("\nSearching for a teacher:");
        Teacher foundTeacher = SSystem.searchTeacher("T013");
        System.out.println(foundTeacher != null ? foundTeacher : "Teacher not found.");

        System.out.println("\nSearching for a course:");
        Course foundCourse = SSystem.searchCourse("C002");
        System.out.println(foundCourse != null ? foundCourse : "Course not found.");

        System.out.println("\nSearching for a student:");
        Student foundStudent = SSystem.searchStudent("S127");
        System.out.println(foundStudent != null ? foundStudent : "Student not found.");

        // Assigning a teacher to a course
        SSystem.assignTeacherToCourse("T020", "C007");

        // Registering a course for a student
        SSystem.registerCourseForStudent("S001","C027");
    }
}