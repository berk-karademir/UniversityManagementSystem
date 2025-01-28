package com.workintech.university.comu.faculties.tourism.departments;

import com.workintech.university.Department;
import com.workintech.university.Faculty;
import com.workintech.university.comu.faculties.tourism.TourismFaculty;

public class TravelManagement extends Department {




    public TravelManagement() {
        super(302L, "TravelManagement", "Travel Management Head's Name", new TourismFaculty());
    }

    public TravelManagement(Long id, String name, String departmentHead, Faculty faculty) {
        super(id, name, departmentHead, faculty);
    }

    public void lessonToLearn() {
        System.out.println("Lessons: Çanakkle Savaşları, Anadolu Uygarlıkları, Mitoloji");
    }



}

