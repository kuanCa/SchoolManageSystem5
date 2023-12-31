package org.example;

public class SchoolManageSystem {
    private Departement[] departements = new Departement[5];//MAx 5 departements
    private Student[] students = new Student[200];//Max 200 students
    private Teacher[] teachers = new Teacher[20];//Max 20 teachers
    private Course[] courses = new Course[30];//Max 30 courses

    public void addDepartment(String departmentName) {
        Departement newDepartment = new Departement(departmentName);
    }

    // Method to add a new student
    public void addStudent(String firstName, String lastName, String departmentId) {
        Departement department = searchDepartement(departmentId);
        if (department != null) {
            Student newStudent = new Student(firstName, lastName, department);
        } else {
            System.out.println("Can not find Department");
        }
    }

    // Method to add a new teacher
    public void addTeacher(String firstName, String lastName, String departmentId) {
        Departement department = searchDepartement(departmentId);
        if (department != null) {
            Teacher newTeacher = new Teacher(firstName, lastName, departmentId);
        } else {
            System.out.println("Can not find Department");
        }
    }

    // Method to add a new course
    public void addCourse(String courseName, double credit, String departmentId) {
        Departement department = searchDepartement(departmentId);
        if (department != null) {
            Course newCourse = new Course(courseName, credit, department);
        } else {
            System.out.println("Can not find Department");
        }
    }

    private Departement searchDepartement(String departmentId) {
        return null;
    }

    public void assignTeacherToCourse(String t020, String c007) {
    }

    public void registerCourseForStudent(String s001, String c027) {
    }

    public Student searchStudent(String s127) {
        return null;
    }

    public Course searchCourse(String c002) {
        return null;
    }

    public Teacher searchTeacher(String t013) {
        return null;
    }

    public Departement searchDepartment(String d011) {
        return null;
    }

    public void displayCourses() {
    }

    public void displayDepartments() {
    }

    public void displayStudents() {
    }

    public void displayTeachers() {
    }

    class SchoolManagementSystem {
        public void displayDepartments() {
            for (Departement department : departements) {
                if (department != null) {
                    System.out.println(department); // Implement Department's toString method
                }
            }
        }
        // Method to display all students with their courses and department information if available
        public void displayStudents() {
            for (Student student : students) {
                if (student != null) {
                    System.out.println(student); // Implement Student's toString method
                }
            }
        }
        // Method to display all teachers with their courses and department information if available
        public void displayTeachers() {
            for (Teacher teacher : teachers) {
                if (teacher != null) {
                    System.out.println(teacher); // Implement Teacher's toString method
                }
            }
        }

        // Method to display all courses with their teacher, students, and department information if available
        public void displayCourses() {
            for (Course course : courses) {
                if (course != null) {
                    System.out.println(course); // Implement Course's toString method
                }
            }
        }
        // Method to search for a department based on departmentId
        public Departement searchDepartment(String departmentId) {
            for (Departement department : departements) {
                if (department != null && department.getDepartmentId().equals(departmentId)) {
                    return department;
                }
            }
            return null;
        }
        // Method to search for a teacher based on teacherId
        public Teacher searchTeacher(String teacherId) {
            for (Teacher teacher : teachers) {
                if (teacher != null && teacher.getTeacherId().equals(teacherId)) {
                    return teacher;
                }
            }
            return null;
        }
        // Method to search for a course based on courseId
        public Course searchCourse(String courseId) {
            for (Course course : courses) {
                if (course != null && course.getCourseId().equals(courseId)) {
                    return course;
                }
            }
            return null;
        }
        // Method to search for a student based on studentId
        public Student searchStudent(String studentId) {
            for (Student student : students) {
                if (student != null && student.getStudentId().equals(studentId)) {
                    return student;
                }
            }
            return null;
        }
        // Method to assign a teacher to a specific course
        public void assignTeacherToCourse(String teacherId, String courseId) {
            Teacher teacher = searchTeacher(teacherId);
            Course course = searchCourse(courseId);

            if (teacher != null && course != null) {
                course.setTeacher(teacher);
            } else {
                System.out.println("Teacher or course cannot find.");
            }
        }
        // Method to register a course for a student
        public void registerCourseForStudent(String studentId, String courseId) {
            Student student = searchStudent(studentId);
            Course course = searchCourse(courseId);

            if (student != null && course != null) {
            } else {
                System.out.println("Student or course cannot find.");
            }
        }
    }
}