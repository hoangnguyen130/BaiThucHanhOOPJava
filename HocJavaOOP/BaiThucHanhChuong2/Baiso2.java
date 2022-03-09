import java.util.Scanner;

public class Baiso2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao n:");
        int n = scan.nextInt();
        if (n % 2 == 0){
            System.out.println("n la so chan");
        }else System.out.println("n la so le");
    }
}
