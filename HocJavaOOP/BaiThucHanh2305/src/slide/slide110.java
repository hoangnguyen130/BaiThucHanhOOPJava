package slide;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class slide110 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arrlistint = new ArrayList<>();
        System.out.println("Cac phan tu trong arraylist la: ");
        add(arrlistint);
        remove(arrlistint);
        sort(arrlistint);
    }
    public static void add(ArrayList<Integer> arrlistint){
        System.out.println("Nhap vao n: ");
        int n = scan.nextInt();
        for ( int i = 0; i< n; i++ ){
            System.out.println("Nhap vao so thu " + (i + 1) + " : ");
            int add;
            add = scan.nextInt();
            arrlistint.add(add);
        }
        for (int i : arrlistint ){
            System.out.print(i + "\t");
        }
        
    }
    public static void remove(ArrayList<Integer> arrlistint){
        System.out.println("\nNhap vao so can them: ");
        int add = scan.nextInt();
        System.out.println("Cac phan tu trong arraylist la: ");
        for (int i = 0; i < arrlistint.size(); i++){
            if (arrlistint.get(i) == add){
                arrlistint.remove(i);
            }
        }
        arrlistint.add(add);
        System.out.print(arrlistint + "\t");
    }
    public static void sort(ArrayList<Integer> arrlistint){
        Collections.sort(arrlistint);
        System.out.println("\nCac phan tu sau khi sap xep la: ");
        for (int i : arrlistint){
            System.out.print(i + "\t") ;
        }
    }
}
