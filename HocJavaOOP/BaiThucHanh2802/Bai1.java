import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a , b;
        System.out.println("Nhap vao so duong a:");
        a = scan.nextInt();
        System.out.println("Nhap vao so duong b:");
        b = scan.nextInt();
        while ( a != b){
            if ( a > b ){
                a-=b;
            }else { b -= a;}
        }
        System.out.println("Ucln la: " + a);
    }
}