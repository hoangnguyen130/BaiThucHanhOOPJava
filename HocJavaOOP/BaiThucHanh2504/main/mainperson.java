package main;
import Person.Student.student;
import Person.Employee.Employee;
import Person.Person;
import Person.Student.OfflineStudent;
import Person.Student.OnlineStudent;
public class mainperson {
    public static void main(String[] args) {
        student hs = new student("Hoang", 18,"Ninhbinh", 01515, 135);
        OfflineStudent hs1 = new OfflineStudent("Hoang", 18, "NinhBinh", 2313, 135, "");
        OnlineStudent hs2 = new OnlineStudent("Name", 18, "Ha noi", 1314, 132, "");
        Person ps = new Person("Name", 42, "", 94);
        Employee epl = new Employee("Nhan", 36, " ", 32  ,  "Cong nhan");
        hs.In();
        hs1.In();
        hs2.In();
        ps.In();
        epl.In();
    }
}
