package com.workintech.university.comu.faculties.tourism.departments;

import com.workintech.university.Comu;
import com.workintech.university.Department;
import com.workintech.university.University;
import com.workintech.university.Faculty;
import com.workintech.university.comu.faculties.tourism.TourismFaculty;

public class Accommodation extends Department {

    public Accommodation() {
        super(301L, "Accommodation", "Accommodation Head's Name", new TourismFaculty());
    }

    public Accommodation(Long id, String name, String departmentHead, Faculty faculty) {
        super(id, name, departmentHead, faculty);
    }


    public void lessonToLearn() {

    }
}
