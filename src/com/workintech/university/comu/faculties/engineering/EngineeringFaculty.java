package com.workintech.university.comu.faculties.engineering;

import com.workintech.university.Faculty;
import com.workintech.university.University;
import com.workintech.university.Comu;

public class EngineeringFaculty extends Faculty {


    public EngineeringFaculty() {
        super(100L, "Engineering Faculty", "Engineering Faculty Dean's Name", "Terzıoglu Campus", new Comu());
    }

    public EngineeringFaculty(Long id, String name, String dean, String address, University university) {
        super(id, name, dean, address, university);
    }
}
