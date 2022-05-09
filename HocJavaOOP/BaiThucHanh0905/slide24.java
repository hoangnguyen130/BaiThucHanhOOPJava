import java.util.ArrayList;
import java.util.Scanner;

public class slide24 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListIntegers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.println("Nhap so phan tu cua Array list: ");
        int n = scan.nextInt();
        for ( int i = 0; i < n; i++){
            System.out.println("Nhap phan tu thu " + i + ":");
            number = scan.nextInt();
            arrayListIntegers.add(number);
        }
        int max = arrayListIntegers.get(0);
        for (int i = 1; i < arrayListIntegers.size(); i++){
            if ( arrayListIntegers.get(i).compareTo(max) > 0){
                max = arrayListIntegers.get(i);
            }
        }
        System.out.println("Phan tu lon nhat la: " + max);
    }
}
