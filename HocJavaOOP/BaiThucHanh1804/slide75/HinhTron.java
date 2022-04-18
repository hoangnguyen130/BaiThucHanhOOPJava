package slide75;
import java.util.Scanner;
public class HinhTron extends HinhHoc {
    public float BanKinh;
    public HinhTron(){
        name = "Hinh Tron";
    }
    public void nhapBanKinh(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ban kinh:");
        BanKinh = scan.nextFloat();
    }
    public void tinhchuvi(){
        chuvi = 2 * PI * BanKinh;
    }
    public void tinhdientich(){
        dientich = PI * BanKinh * BanKinh;
}
}