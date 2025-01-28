package com.workintech.university.comu.faculties.engineering.departments;

import com.workintech.university.Department;
import com.workintech.university.Faculty;
import com.workintech.university.comu.faculties.engineering.EngineeringFaculty;

public class MechanicalEngineering extends Department {


    public MechanicalEngineering() {
        super(102L, "Mechanical Engineering", "Mechanical Engineering Head's Name", new EngineeringFaculty());
    }

    public void lessonToLearn() {
        System.out.println("Lessons: Mukavemet, Termodinamik, Akışkanlar Mekaniği");
    }


}
