package shapes;
import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong(){
        name = "Hinh Vuong";
    }
    public void nhapcanh(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap canh:");
        dai = rong = scan.nextFloat();
    }
}
