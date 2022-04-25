package Person.Employee;
public class ParttimeEmployee extends Employee {
    int luonggio;
    public ParttimeEmployee(String Name, int age, String Address, int Phonenumber, String Nghenghiep, int luonggio){
        super(Name, age, Address, Phonenumber, Nghenghiep);
        this.luonggio = luonggio;
    }
    public int getluonggio(){
        return luonggio;
    }
    public void setluonggio(int luonggio){
        this.luonggio = luonggio;
    }
    @Override
    public void In(){
        super.In();
        System.out.println("Luong gio: " + luonggio);
    }
}
