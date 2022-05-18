import java.util.HashSet;
import java.util.Scanner;

public class slide52{
public static void main(String[] args) {
        int number;
        int spt;
        HashSet<Integer> hashSetIntegers = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        hashSetIntegers.add(0);
        hashSetIntegers.add(3);
        hashSetIntegers.add(1);
        hashSetIntegers.add(4);
        hashSetIntegers.add(2);
        hashSetIntegers.add(8);
        System.out.println("Cac phan tu trong hashSetInteger la: ");
        System.out.println(hashSetIntegers);
        System.out.println("Nhap vao so phan tu can them: ");
        spt = scan.nextInt();
        for (int i = 0; i < spt; i++){
            System.out.println("Nhap phan tu can them: ");
            number = scan.nextInt();
            if (!hashSetIntegers.contains(number)){
                hashSetIntegers.add(number);
                System.out.println("Them thanh cong!");
                System.out.println("Cac phan tu trong hashSetInteger sau khi them thanh cong: ");
                System.out.println(hashSetIntegers);
            }
            else {
                System.out.println("Phan tu " + number + " da ton tai!");
            }
        }
        scan.close();
    }   
}