import java.util.Scanner;

public class person {
    Scanner scan = new Scanner(System.in);
    String ID;
    String Name;
    String Gender;
    String Address;
    void Nhapthongtin(){
        System.out.print("\nNhap vao id: ");
        ID = scan.nextLine();
        System.out.print("\nNhap vao ten: ");
        Name = scan.nextLine();
        System.out.print("\nNhap vao gioi tinh: ");
        Gender = scan.nextLine();
        System.out.print("\nNhap dia chi: ");
        Address = scan.nextLine();
    }
    void inthongtin(){
        System.out.print("\nId: " + ID);
        System.out.print("\nTen: " + Name);
        System.out.print("\nGioi tinh: " + Gender);
        System.out.print("\nDia chi: " + Address);
    }
}
