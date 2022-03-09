import java.util.Scanner;

public class Baiso3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao ten cua ban: ");
        String name = scan.nextLine();
        System.out.print("Nhap vao nam sinh cua ban: ");
        int age = scan.nextInt();
        if ( 2022 - age < 16){
            System.out.println("Ban " + name + " o do tuoi vi thanh nien");
        }else if ( 2022 - age >= 16 && 2022 - age < 18){
            System.out.println("Ban " + name + " o do tuoi truong thanh");
        }else if ( 2022 - age >= 18) System.out.println("Ban " + name + " da gia");
    }
}
