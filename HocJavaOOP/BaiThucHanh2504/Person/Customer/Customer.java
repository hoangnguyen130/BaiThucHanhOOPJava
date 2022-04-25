package Person.Customer;
import Person.Person;
public class Customer extends Person {
    public Customer(String Name, int age, String Address, int Phonenumber){
        super(Name, age, Address, Phonenumber);
    }
    @Override
    public void In(){
        super.In();
        System.out.println("Khach thuong");
    }
}
