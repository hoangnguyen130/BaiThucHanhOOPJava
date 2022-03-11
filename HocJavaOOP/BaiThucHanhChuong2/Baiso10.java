
import java.util.Scanner;

public class Baiso10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao 1 chuoi: ");
        String chuoi = scan.nextLine();
        System.out.print("Nhap vao 1 ky tu: ");
        String kt = scan.nextLine();
        int dem = 0;
        for (int i = 0; i < chuoi.length(); i++){
            if ( chuoi.charAt(i) == kt.charAt(0)){
                dem++;
            }
        }
        System.out.print("So lan xuat hien cua ky tu " + kt + " la: " + dem);
    }
}
