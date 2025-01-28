package com.workintech.university.comu.faculties.fineArts;

import com.workintech.university.Faculty;
import com.workintech.university.University;
import com.workintech.university.Comu;

public class FineArtsFaculty extends Faculty {

    public FineArtsFaculty() {
        super(200L, "Fine Arts Faculty", "Fine Arts Faculty Dean's Name", "Terzioglu Campus", new Comu());
    }

    public FineArtsFaculty(Long id, String name, String dean, String address, University university) {
        super(id, name, dean, address, university);
    }
}
