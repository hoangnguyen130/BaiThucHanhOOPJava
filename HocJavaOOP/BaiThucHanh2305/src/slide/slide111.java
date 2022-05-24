package slide;
import java.util.LinkedList;
import java.util.Scanner;

public class slide111 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        nhap(list);
        trungbinhcong(list);
    }
    public static void nhap(LinkedList<Integer> list){
        System.out.println("Nhap vao n: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Nhap vao so thu " + (i+1) + " : ");
            int add = scan.nextInt();
            list.add(add);
        }
        scan.close();
    }
    //tinh trung binh cong cac so chan
    public static void trungbinhcong(LinkedList<Integer> list){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 == 0){
                sum += list.get(i);
                count += 1;
            }
        }
        float tbc = sum / count;
        System.out.println("Trung binh cong cac so chan la: " + tbc);
    }
}
