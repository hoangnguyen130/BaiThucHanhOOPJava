import java.util.Scanner;
import java.util.TreeSet;

public class slide67 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSetIntegers = new TreeSet<>();
        Scanner scan = new Scanner(System.in);
        treeSetIntegers.add(0);
        treeSetIntegers.add(3);
        treeSetIntegers.add(1);
        treeSetIntegers.add(4);
        treeSetIntegers.add(2);
        treeSetIntegers.add(8);
        System.out.println("Cac phan tu trong treeSetIntegers: ");
        System.out.println(treeSetIntegers);
        System.out.println("Nhap phan tu can them: ");
        number = scan.nextInt();
        if (!treeSetIntegers.contains(number)){
            treeSetIntegers.add(number);
            System.out.println("Them thanh cong! ");
            System.out.println("Cac phan tu trong treeSetIntegers sau khi them: ");
            System.out.println(treeSetIntegers);
        }else {
            System.out.println("Phan tu " + number + " da ton tai!");
        }
        scan.close();
    }
}
