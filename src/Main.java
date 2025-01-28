import com.workintech.university.Comu;
import com.workintech.university.Department;
import com.workintech.university.Faculty;
import com.workintech.university.University;
import com.workintech.university.comu.faculties.engineering.EngineeringFaculty;
import com.workintech.university.comu.faculties.engineering.departments.ComputerEngineering;
import com.workintech.university.comu.faculties.engineering.departments.MechanicalEngineering;
import com.workintech.university.comu.faculties.tourism.TourismFaculty;
import com.workintech.university.comu.faculties.tourism.departments.Accommodation;
import com.workintech.university.comu.faculties.tourism.departments.TravelManagement;

import java.sql.SQLOutput;

public class Main {
    static void br() {
        System.out.println();
    }
    public static void main(String[] args) {

//        System.out.println("--------------------***   outputs of related to COMU only  ***-------------------");
//
//
//        //sadece ÇOMÜ için ( comu ve related instancelar)
//        University comu = new Comu();
//        System.out.println("University(Comü) genel initial output:\n"+ comu);
//
//        //turizm fak ve bölümleri
//        Faculty comuTourism = new TourismFaculty();
//        System.out.println("Faculty(comuTourism) genel initial output:\n" + comuTourism);
//
//        Department comuTourismTravelMan = new TravelManagement();
//        System.out.println("Deparment(comuTourismTravelMan) output:\n" + comuTourismTravelMan);
//
//        Department comuTourismAccommodation = new Accommodation();
//        System.out.println("Deparment(comuTourismAccommodation) output:\n" + comuTourismAccommodation);
//
//
//        //mühendislik fak ve bölümleri
//        Faculty comuEngineering = new EngineeringFaculty();
//        Department comuEngineeringComputer = new ComputerEngineering();
//        Department comuEngineeringMechanical = new MechanicalEngineering();
//        comuEngineering.addDepartment(comuEngineeringComputer);
//        comuEngineering.addDepartment(comuEngineeringMechanical);
//
//
//
//        //önce ünive'ye fakülteleri, sonra fakülteye departmentları(bölümleri) ekledik
//        comu.addFaculty(comuTourism);
//        comuTourism.addDepartment(comuTourismTravelMan);
//        comuTourism.addDepartment(comuTourismAccommodation);
//        System.out.println("---------------------------------------");
//        System.out.println("COMU'nün son hali >>>\n" +comu);

        /*
        -üni yarat,
        -fakülteler yarat, üniye bunları ekle,
        -fakültelere bölüm yada bölümleri ekle,
        -bölümlere dersleri ekle  (** ! **)

        */




        System.out.println("--------------------***   outputs of related to basic constructors  ***-------------------");


        University universityInstance = new University("My university","Rektör Adı");
        University universityInstance2 = new University("My university - 2","Rektör Adı - 2");

        Faculty facultyInstance = new Faculty(900L,"Fakülte adı","Dekan adı","Fakülte Adresi",universityInstance);
        Faculty facultyInstance2 = new Faculty(900L,"Fakülte adı - 2 ","Dekan adı - 2","Fakülte Adresi - 2",universityInstance);

        Department departmentInstance = new Department(901L, "Bölüm adı","Bölüm başkanı adı", facultyInstance);

        System.out.println("Üni yaratıldı: boş, fakültesiz hali >>>\n" + universityInstance);

        br();
        /*
        hem facultyInstance, hem de facultyInstance2 'nin University university fieldları universityInstance ile set edildi.
        yani her iki fakülte de universityInstance universitesine ait, buz yüzden bu fakülteler universityInstance2 universitesine eklenemez: lookat: University > addFaculty();
        */
        System.out.println("Universiteye ait olmayan bir fakülteyi eklemeye çaşılıyorum");
        universityInstance2.addFaculty(facultyInstance2);
        facultyInstance.addDepartment(departmentInstance);



        System.out.println("\n------------- ***   ( RESULT ) - After adding faculty and faculties' departments  *** ----------------\n" + universityInstance);

        System.out.println("---------------------");
        System.out.println(universityInstance);


    }
}
