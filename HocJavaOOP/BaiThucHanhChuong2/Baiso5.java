import java.util.Scanner;

public class Baiso5 {        
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, sum = 0;
        while (sum <= 100){
            System.out.println("nhapp vao n:");
            n = scan.nextInt();
            sum += n;
        }
        System.out.println("tong la:" + sum);
    }
}
