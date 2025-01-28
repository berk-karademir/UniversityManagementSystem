package com.workintech.university.comu.faculties.engineering.departments;

import com.workintech.university.Department;
import com.workintech.university.Faculty;
import com.workintech.university.comu.faculties.engineering.EngineeringFaculty;

import java.util.List;

public class ComputerEngineering extends Department {

    private List<String> programmingLanguagesShouldTaught;



    public ComputerEngineering() {
        super(101L, "Computer Engineering", "Computer Engineering Head's Name", new EngineeringFaculty());

    }


    public void lessonToLearn() {
        System.out.println("Lessons: Intro to Programming, Data Structures, Algorithms, Operating Systems");
    }


    public void addProgrammingLanguage(String programmingLanguage){
        // boşluk kontrolü yap!
        if(programmingLanguage == null || programmingLanguage.trim().isEmpty())
            programmingLanguagesShouldTaught.add(programmingLanguage);
    }

}
