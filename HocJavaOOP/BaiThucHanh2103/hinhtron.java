import java.util.Scanner;

public class hinhtron {
    final float pi =3.14f;
    float bankinh;
    float cv;
    void NhapBanKinh(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nNhap vao ban kinh:");
        bankinh = scan.nextFloat();

    }
    void TinhChuVi(){
        cv = 2 * pi * bankinh;

    }
    void InChuVi(){
        System.out.print("\nchu vi la: " + cv);
    }
}
