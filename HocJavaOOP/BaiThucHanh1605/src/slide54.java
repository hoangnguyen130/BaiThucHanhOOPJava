import java.util.HashSet;
import java.util.Scanner;

public class slide54 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetStrings = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        hashSetStrings.add("Willson");
        hashSetStrings.add("Nike");
        hashSetStrings.add("Volvo");
        hashSetStrings.add("Kia");
        hashSetStrings.add("Lenovo");
        hashSetStrings.add("Lenovo");
        System.out.println("Cac phan tu trong hashSetStrings la: ");
        System.out.println(hashSetStrings);
            System.out.println("Nhap phan tu can xoa: ");
            name = scan.nextLine();
            if ( hashSetStrings.contains(name)){
                hashSetStrings.remove(name);
                System.out.println("Xoa thanh cong!");
                System.out.println("Cac phan tu con lai: ");
                System.out.println(hashSetStrings);
            }
            else{
                System.out.println("Xoa khong thanh cong!");
            }
        
        scan.close();
    }

}
