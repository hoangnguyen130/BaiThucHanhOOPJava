import java.util.ArrayList;
import java.util.ListIterator;
public class slide19 {
    public static void main(String[] args) {
        ArrayList<Character> arrlistchar = new ArrayList<>();
        arrlistchar.add('a');
        arrlistchar.add('e');
        arrlistchar.add('b');
        arrlistchar.add('C');
        ListIterator<Character> listIterator = arrlistchar.listIterator();
        System.out.println("Cac phan tu trong list la: ");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}