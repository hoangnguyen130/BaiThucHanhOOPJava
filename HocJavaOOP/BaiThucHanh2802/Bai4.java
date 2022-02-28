import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("nhap vao so nguyen duong n: ");
        n = scan.nextInt();
        System.out.println("cac so nguyen to nho hon n la:");
        for ( int i = 2; i < n; i++){
            if ( songuyento(i)){
                System.out.print(+ i + " ");
            }
        }

    }
    public static boolean songuyento(int a){
        if (a < 2){
            return false;
        }
        int canbac2 = (int) Math.sqrt(a);
        for (int i =2; i <= canbac2; i++ ){
            if ( a % i == 0){
                return false;
            }
        }
        return true;

    }
}
