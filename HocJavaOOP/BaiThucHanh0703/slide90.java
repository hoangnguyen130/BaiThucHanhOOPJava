import java.util.Scanner;

public class slide90 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nhap = new String();
        System.out.print("Nhap vao 1 chuoi ky tu bat ki: ");
        nhap = scan.next();
        for (int i = 0; i < nhap.length(); i++){
            System.out.print("ky tu thu " + i + "la: " + nhap.charAt(i) + "\n");
        }


    }
}
