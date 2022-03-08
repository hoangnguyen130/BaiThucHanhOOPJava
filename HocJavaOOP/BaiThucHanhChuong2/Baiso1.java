import java.util.Scanner;


public class Baiso1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao a va b:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = a + b;
        System.out.println("tong: " + sum );
        int diffirent = a - b;
        System.out.println("hieu: " + diffirent);
        int product = a * b;
        System.out.println("tich: " + product);
        float quotient = a / b;
        System.out.println("thuong: " + quotient);
        int remainder = a % b;
        System.out.println("so du: " + remainder);
        if ( a > b){
            System.out.println("a lon hon b");
        }else if ( a < b){
            System.out.println("a nho hon b");
        }else if(a == b){
            System.out.println("a bang b");
        }
    }
    
}