import java.util.Scanner;

public class slide74 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua mang: ");
        int pt = scan.nextInt();
        int a[] = new int[pt];
        int sum = 0;
        for (int i = 0;i < pt; i++){
            System.out.print("Nhap phan tu a[" + i + "]: ");
            a[i] = scan.nextInt();
        }
            
        for (int i = 0; i < pt; i++){
            if( a[i] % 2 == 0){
                sum += a[i];
            }
        }    
        System.out.println("Sum = " + sum);

    }
}
