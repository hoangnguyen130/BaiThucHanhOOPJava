import java.util.ArrayList;
public class slide17 {
    public static void main(String[] args) {
        ArrayList<Integer> arrlistint = new ArrayList<>();
        arrlistint.add(8);
        arrlistint.add(0);
        arrlistint.add(9);
        arrlistint.add(0);
        System.out.println("Cac phan tu trong list la: ");
        for (int i = 0; i < arrlistint.size(); i++){
            System.out.println(arrlistint.get(i) + "\t");
        }
    }
}