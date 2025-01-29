package com.workintech.university;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class University {

    private String name;
    private List<Faculty> faculties;        // composition
    private String chancellorName;
    // default cons. == Invalidate

    public University(String name, String chancellorName) {
        if (name == null || name.trim().isBlank() || name.isEmpty()) {
            System.out.println("Invalid university name format!");
            return;
        }
        this.setName(name);
        this.chancellorName = chancellorName;
        this.faculties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void addFaculty(Faculty faculty) {

        // Fakülte daha önceden eklenmiş mi kontrol et
        if (!faculties.contains(faculty)) {
            this.faculties.add(faculty);
            // Fakültenin bu üniversiteye ait olduğunu belirt
        }


        if (faculty == null) {
            System.out.println("Faculty cannot be null!");
        }

        // Fakültenin bu üniversiteye ait olup olmadığını kontrol et
        assert faculty != null;
        if (faculty.getUniversity() == null && !faculty.getUniversity().equals(this)) {
            System.out.println("This faculty belongs to another university!");
        }



    }

    public boolean removeFaculty(Faculty faculty) {
        return false;
    }


    //sadece iterator ile remove;
    public void removeFaculty(Integer facultyId) {
        Iterator<Faculty> iterator = faculties.iterator();
        while (iterator.hasNext()) {
            Faculty faculty = iterator.next();
            if (faculty.getId().equals(facultyId)) {
                iterator.remove();
            }
        }
    }


    @Override
    public String toString() {
        return name + "'s chancellor is "+ chancellorName + "\n" + name + " has " + faculties.size() +(faculties.size() == 1 ? " faculty" : " faculties") +  " in it."+(faculties.size() == 1 ? "\nFaculty\n" : "\nFaculties\n") + faculties;
    }
}
