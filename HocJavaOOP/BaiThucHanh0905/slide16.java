import java.util.ArrayList;
public class slide16 {
    public static void main(String[] args) {
        ArrayList<String> arrlistString = new ArrayList<>();
        arrlistString.add("java");
        arrlistString.add("php");
        arrlistString.add("c#");
        arrlistString.add("C++");
        System.out.println("Cac phan tu trong list la: ");
        for (int i = 0; i < arrlistString.size(); i++){
            System.out.println(arrlistString.get(i) + "\t");
        }
    }
}