import java.util.ArrayList;
import java.util.Iterator;
public class slide18 {
    public static void main(String[] args) {
        ArrayList<Float> arrlistFloat = new ArrayList<>();
        arrlistFloat.add(0.5f);
        arrlistFloat.add(0.7f);
        arrlistFloat.add(7.26f);
        arrlistFloat.add(9.3f);
        Iterator<Float> iterator = arrlistFloat.iterator();
        System.out.println("Cac phan tu trong list la: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}