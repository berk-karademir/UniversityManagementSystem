package com.workintech.university.comu.faculties.tourism;

import com.workintech.university.University;
import com.workintech.university.Faculty;
import com.workintech.university.Comu;

public class TourismFaculty extends Faculty {

    public TourismFaculty() {
        super(300L, "Tourism Faculty", "Tourism Faculty Dean's Name", "Terzioglu Campus", new Comu());
    }

    public TourismFaculty(Long id, String name, String dean, String address, University university) {
        super(id, name, dean, address, university);
    }
}
