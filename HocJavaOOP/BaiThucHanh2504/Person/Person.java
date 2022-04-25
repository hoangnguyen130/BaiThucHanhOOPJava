package Person;

public class Person {
    String Name;
    int age;
    String Address;
    int Phonenumber;

    public Person(String Name, int age, String Address, int Phonenumber){
        this.Name = Name;
        this.age = age;
        this.Address = Address;
        this.Phonenumber = Phonenumber;        
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age =age;
    }
    public String getAddress(){
        return Address;
    }
    public void setAddress(String Address){
        this.Address = Address;
    }
    public int getPhonenumber(){
        return Phonenumber;
    }
    public void setPhonenumber(int Phonenumber){
        this.Phonenumber = Phonenumber;
    }
    public void In(){
        System.out.println("Ten: " + Name);
        System.out.println("Tuoi: " + age);
        System.out.println("Dia chi: " + Address);
        System.out.println("So dien thoai: " + Phonenumber);
    }
}
