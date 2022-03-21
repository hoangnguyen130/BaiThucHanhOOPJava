import java.util.Scanner;

public class hinhchunhat {
    Scanner scan = new Scanner(System.in);
    float cd;
    float cr;
    float cvhcn;
    void NhapChieuDai(){
        System.out.print("\nNhap vao chieu dai:");
        cd = scan.nextFloat();
    }
    void NhapChieuRong(){
        System.out.print("\nNhap vao chieu rong: ");
        cr = scan.nextFloat();
    }
    void ChuViHCN(){
        cvhcn = (cd + cr) * 2;
    }
    void inChuViHCN(){
        System.out.print("\nChu vi HCN la: " + cvhcn);
    }
}
