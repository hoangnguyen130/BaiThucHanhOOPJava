import java.util.Scanner;

public class Baiso8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("So chu so cua day: ");
        int so = scan.nextInt();
        int tbc = 0;
        for (int i = 1; i <= so; i++){
            System.out.print("Nhap vao so:: ");
            int n = scan.nextInt();
            tbc += n;
        }
        System.out.print("Trung binh cong la: " +(float)(tbc/so));
    }
}
