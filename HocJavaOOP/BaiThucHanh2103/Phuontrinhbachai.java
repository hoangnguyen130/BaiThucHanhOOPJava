import java.util.Scanner;

import java.lang.Math;

public class Phuontrinhbachai {
    Scanner scan = new Scanner(System.in);
    float a, b, c, delta;
    double x1, x2;
    void nhapheso(){
        System.out.print("\nNhap he so a: ");
        a = scan.nextFloat();
        System.out.print("\nNhap he so b: ");
        b = scan.nextFloat();
        System.out.print("\nNhap he so c: ");
        c = scan.nextFloat();
    }
    void giaiphuongtrinh(){
        delta = b * b - 4 * a * c;
        if (delta > 0){
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
        }
        else if (delta == 0){
            x1 = -b / (2 * a);
        }
        else if (delta < 0){
            System.out.print("\nPhuong trinh vo nghiem!");
        }
    }
    void inketqua(){
        if ( delta > 0){
            System.out.print("\nx1 = " + x1);
            System.out.print("\nx2 = " + x2);
        }
        else if (delta == 0) System.out.print("\nx = " + x1);
    }
}
