import java.util.Scanner;

public class Baiso6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao 1 so nguyen duong: ");
        int so = scan.nextInt();
        do {
            int giaithua = 1;
            for ( int i = 1; i <= so; i++){
                giaithua = giaithua * i;
            }
            System.out.println("giai thua cua " + so + " la: " + giaithua);
        }while ( so <= 0);
    }
}
