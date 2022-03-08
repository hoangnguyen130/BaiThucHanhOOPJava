import java.util.Scanner;

public class slide81 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao so hang: ");
        int h = scan.nextInt();
        System.out.print("Nhap vao so cot: ");
        int c = scan.nextInt();
        int a[][] = new int[h][c];
        for (int i = 0; i < h; i++){
            for (int j = 0; j < c; j++){
                System.out.print("Nhap vao phan tu a[" + i + "][" + j + "]: ");
                a[i][j] = scan.nextInt();
            }
        }
        int max = 0;
        for (int i = 0; i < h; i++){
            for (int j = 0; j < c; j++){
                if (a[i][j] > max){
                    max = a[i][j];
                }
            }
        }
        System.out.print("Phan tu lon nhat la: " + max);
    }
}
