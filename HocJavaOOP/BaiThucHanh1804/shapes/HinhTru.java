package shapes;
import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieucao;
    public HinhTru(){
        name = "Hinh Tru";
    }
    public void nhapchieucao(){
        nhapBanKinh();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap chieu cao:");
        chieucao = scan.nextFloat();
    }
    public void tinhthetich(){
        tinhdientich();
        thetich = dientich * chieucao;
    }
}
