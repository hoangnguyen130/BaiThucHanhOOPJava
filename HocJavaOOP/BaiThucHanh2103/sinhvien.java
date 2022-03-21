import java.util.Scanner;

public class sinhvien {
    Scanner scan = new Scanner(System.in);
    String Msv;
    String Name;
    String Gender;
    String Address;
    String Date;
    void nhapthongtinsv(){
        System.out.print("\nNhap ma sinh vien: ");
        Msv = scan.nextLine();
        System.out.print("\nNhap ho ten: ");
        Name = scan.nextLine();
        System.out.print("\nNhap gioi tinh: ");
        Gender = scan.nextLine();
        System.out.print("\nNhap dia chi: ");
        Address = scan.nextLine();
        System.out.print("\nNhap ngay sinh: ");
        Date = scan.nextLine();
    }
    void inthongtinsv(){
        System.out.print("\nMa sinh vien: " + Msv);
        System.out.print("\nHo ten: " + Name);
        System.out.print("\nGioi tinh: " + Gender);
        System.out.print("\nDia chi: " + Address);
        System.out.print("\nNgay sinh: " + Date);
    }

}
