import java.util.LinkedList;
import java.util.List;

public class slide38 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("java");
        list.add("C++");
        list.add("php");
        list.add("java");
        System.out.println("vi du su dung phuong thuc addAll()");
        LinkedList<String> listA = new LinkedList<>();
        listA.addAll(list);
        System.out.println("listA: ");
        showList(listA);

        System.out.println("\nvi du su dung phuong thuc retainAll()");
        LinkedList<String> listB = new LinkedList<>();
        listB.add("java");
        listA.retainAll(listB);
        System.out.println("listA: ");
        showList(listA);
        System.out.println("\nvi du su dung phuong thuc removeAll()");
        list.removeAll(listB);
        
    }
}
