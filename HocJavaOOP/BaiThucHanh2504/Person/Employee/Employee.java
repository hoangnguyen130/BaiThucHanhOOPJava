package Person.Employee;
import Person.Person;
public class Employee extends Person {
    String Nghenghiep;
    public Employee(String Name, int age, String Address, int Phonenumber, String Nghenghiep){
        super(Name, age, Address, Phonenumber);
        this.Nghenghiep = Nghenghiep;
    }
    public String getNghenghiep(){
        return Nghenghiep;
    }
    public void setNghenghiep(String Nghenghiep){
        this.Nghenghiep = Nghenghiep;
    }
    @Override
    public void In(){
        super.In();
        System.out.println("Nghe nghiep: " + Nghenghiep);
    }
}
