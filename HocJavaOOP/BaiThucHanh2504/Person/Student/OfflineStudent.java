package Person.Student;
public class OfflineStudent extends student {
    String hocoff;
    public OfflineStudent(String Name, int age, String Address, int Phonenumber, int id, String hocoff){
        super(Name, age, Address, Phonenumber, id);
        this.hocoff = hocoff;
    }
    public String gethocoff(){
        return hocoff;
    }
    public void sethocoff(String hocoff){
        this.hocoff = hocoff;
    }
    @Override
    public void In(){
        super.In();
        System.out.println("Hoc off" + hocoff);
    }
}
