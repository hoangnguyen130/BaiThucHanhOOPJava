package Person.Student;

public class OnlineStudent extends student {
    String hoconl;
    public OnlineStudent( String Name, int age, String Address, int Phonenumber, int id, String hoconl){
        super(Name, age, Address, Phonenumber, id);
        this.hoconl = hoconl;
    }
    public String gethoconl(){
        return hoconl;
    }
    public void sethoconl(String hoconl){
        this.hoconl = hoconl;
    }
    @Override
    public void In(){
        super.In();
        System.out.println("Hoc onl" + hoconl);
    }
}
