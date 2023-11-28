package org.example;

public class Departement {
    private static int nextId = 1;
    private String departmentId;
    private String departmentName;
    public Departement(String departmentId) {
        this.departmentId = departmentId;
    }
    public Departement(){
        this.departmentId = "D" + String.format("%03d", nextId++);
        this.departmentName = departmentName;
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
        Departement.nextId = nextId;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
