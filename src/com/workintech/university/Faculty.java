package com.workintech.university;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Faculty {

    private Long id;
    private String name;
    private LocalDateTime createdDate;
    private String dean; // person ?
    private String address;
    private Set<Department> departments;
    private University university;



    public Faculty(Long id, String name, String dean, String address, University university) {
        this.id = id;
        this.name = name;
        this.dean = dean;
        this.address = address;
        this.university = university;
        this.departments = new HashSet<>();
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Set<Department> getDepartments() {
        return departments;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }

    public void addDepartment(Department department) {
        if (department.getFaculty().equals(this)){
            departments.add(department);
        } else {
            System.out.println("Department " + department.getName() + " cannot be added to " + name);
        }
    }


// Override equals method from Object class of Java

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Faculty faculty = (Faculty) obj;
        return this.id.equals(faculty.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    @Override
    public String toString() {
        return
                "\nFaculty's\n" + "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Dean: " + dean + "\n" +
                "Address: " + address + "\n" +
                 name + " has " + departments.size() + (departments.size() == 1 ? " department.\n" : " departments") + departments + "\n" ;

    }
}
