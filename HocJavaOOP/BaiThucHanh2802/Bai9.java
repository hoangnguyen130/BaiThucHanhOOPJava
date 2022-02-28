import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap vao so nguyen duong: ");
        int n = scan.nextInt();
        int dao = 0;
        while( n != 0){
            int i = n % 10;
            dao = dao*10 + i;
            n = n / 10;
        }
        System.out.print("so dao nguoc la: " + dao);
    }
}
