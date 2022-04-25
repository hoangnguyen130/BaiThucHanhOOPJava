package Person.Customer;
import Person.Person;
public class CustomerVIP extends Person {
    public CustomerVIP(String Name, int age, String Address, int Phonenumber){
        super(Name, age, Address, Phonenumber);
    }
@Override
public void In(){
    super.In();
    System.out.println("Khach Vip");
    }
}