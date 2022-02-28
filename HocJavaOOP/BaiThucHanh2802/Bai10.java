import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap vao so n: ");
        int n = scan.nextInt();
        int sum = 0;
        while( n != 0){
            n /= 10;
            sum +=1;
        }
        System.out.println("n co " + sum + " chu so ");
    }
}
