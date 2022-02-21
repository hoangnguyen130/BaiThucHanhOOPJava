import java.util.Scanner;

public class slide35 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("nhap vao a:");
        a = scan.nextInt();
        System.out.println("nhap vao b:");
        b = scan.nextInt();
        if (a < b) {
            System.out.println("so nho hon la:" + a);
        }
        else System.out.println("so nho hon la:" + b);

    };
}
