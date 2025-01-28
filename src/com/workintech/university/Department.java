package com.workintech.university;

import java.util.Objects;

public class Department {

    private Long id;
    private String name;
    private String departmentHead;
    private Faculty faculty;

    public Department(Long id, String name, String departmentHead, Faculty faculty) {
        this.id = id;
        this.name = name;
        this.departmentHead = departmentHead;
        this.faculty = faculty;
        faculty.addDepartment(this);
    }



    public Long getId() {
        return id;
    }

    public Faculty getFaculty() {

        return faculty;
    }

    public String getName() {
        return name;
    }

    //List<String> de dönebilir

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Department that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        return  "\nDepartment's" + "\n" +
                "ID: " + id + "\n" +
                "Name: " + name  + "\n" +
                "Head: " + departmentHead + "\n";
    }
}
