package Person.Student;

import Person.Person;

public class student extends Person {
    int id;
    public student(String Name, int age, String Address, int Phonenumber, int id){
        super(Name, age, Address, Phonenumber);
        this.id = id;
    }
    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id = id;
    }
    @Override
    public void In(){
        super.In();
        System.out.println("Ma sinh vien: " + id );
    }
}
