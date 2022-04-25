package Person.Employee;
public class FulltimeEmployee extends Employee {
    int luongthang;
    public FulltimeEmployee(String Name, int age, String Address, int Phonenumber, String Nghenghiep, int luongthang){
        super(Name, age, Address, Phonenumber, Nghenghiep);
        this.luongthang = luongthang;
    }
    public int getluongthang(){
        return luongthang;
    }
    public void setluongthang(int luongthang){
        this.luongthang = luongthang;
    }
    @Override
    public void In(){
        super.In();
        System.out.println("Luong thang: " + luongthang);
    }
}
