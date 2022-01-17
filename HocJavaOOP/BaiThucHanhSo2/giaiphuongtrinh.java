import java.util.Scanner;
import java.lang.Math;

public class giaiphuongtrinh {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double A, B, C;
        double delta;
        double x1, x2;
        System.out.println("Nhap vao A:");
        A = scan.nextDouble();
        System.out.println("Nhap vao B:");
        B = scan.nextDouble();
        System.out.println("Nhap vao B:");
        C = scan.nextDouble();
        delta = B*B - (4*A*C);
        if (delta > 0){
            x1 = (-B - Math.sqrt(delta))/(2*A);
            x2 = (-B + Math.sqrt(delta))/(2*A);
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } else if (delta == 0){
            x1 = (-B - Math.sqrt(delta))/(2*A);
            System.out.println("Nghiem kep x: " + x1);
        } else if(delta < 0){
            System.out.println("Phuong trinh khong co nghiem!");
        }
        
    }
  
}