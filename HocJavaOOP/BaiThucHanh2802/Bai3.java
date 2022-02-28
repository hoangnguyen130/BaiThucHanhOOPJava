import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap vao so nguyen duong n:");
        int n = scan.nextInt();
        int canbac2 = (int) Math.sqrt(n);
        for (int i = 2; i <= canbac2; i++ ){
            if (n % i == 0){
                System.out.println("n khong phai so nguyen to");
            }else System.out.println("n la so nguyen to");
        }
    }
}
