package slide75;
import java.util.Scanner;
public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;
    public HinhChuNhat(){
        name = "Hinh Chu Nhat";
    }
    public void nhapchieudai(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap chieu dai:");
        dai = scan.nextFloat();
    }
    public void nhapchieurong(){
        System.out.println("Nhap chieu rong:");
        Scanner scan = new Scanner(System.in);
        rong = scan.nextFloat();
    }
    public void tinhchuvi(){
        chuvi = (dai + rong) * 2;
    }
    public void tinhdientich(){
        dientich = dai * rong;
    }
}
