package com.workintech.university.comu.faculties.fineArts.departments;

import com.workintech.university.Department;
import com.workintech.university.Faculty;
import com.workintech.university.comu.faculties.fineArts.FineArtsFaculty;

public class Painting extends Department {


    public Painting(){
        super(202L,"Painting","Painting Department Head's Name", new FineArtsFaculty());
    }



    public Painting(Long id, String name, String departmentHead, Faculty faculty) {
        super(id, name, departmentHead, faculty);
    }




    public void lessonToLearn() {

    }
}
