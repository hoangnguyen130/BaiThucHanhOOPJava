import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a , b , c;
        System.out.println("nhap vao 2 canh a, b va canh huyen c: ");
        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat();
        if (a == b){
            System.out.println("tam giac can");
        }else if (a == b && a == c){
            System.out.println("tam giac deu");
        }else if (a + b < c){
            System.out.println("khong phai tam giac");
        }else if (a*a + b*b == c*c){
            System.out.println("tam giac vuong");
        }else if (a*a + b*b == c*c && a == b){
            System.out.println("tam giac vuong can");
        }
    }
}
