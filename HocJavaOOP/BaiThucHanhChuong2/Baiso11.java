import java.util.Scanner;

public class Baiso11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua mang: ");
        int pt = scan.nextInt();
        int a[] = new int[pt];
        for ( int i = 0; i < pt; i++){
            System.out.print("Nhap vao phan tu a[" + ( i + 1) + "]: ");
            a[i] = scan.nextInt();
        }
        System.out.println("Mang ban dau:");
        for ( int i = 0; i < pt; i++){
            System.out.print( a[i] + " " );
        }
        for ( int i = 0; i < pt - 1; i++){
            int ss = a[0];
            for ( int j = i + 1; j < pt; j++){
                if (a[i] > a[j]){
                    ss = a[j];
                    a[j] = a[i];
                    a[i] = ss;
                }
            }
        }
        System.out.println("\nMang tang dan:");
        for (int i = 0; i < pt; i++){
            System.out.print(a[i] + " ");
            
        }
    }   
}
