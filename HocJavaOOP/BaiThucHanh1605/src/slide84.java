import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class slide84 {
    public static void main(String[] args) {
        HashMap<String, String> HashMap = new HashMap<>();
        HashMap.put("CSLT", "Co so lap trinh");
        HashMap.put("C++", "C++");
        HashMap.put("C#", "C sharp");
        HashMap.put("PHP", "PHP");
        HashMap.put("Java", "Java");
        Set<Map.Entry<String, String>> setHashMap = HashMap.entrySet();
        System.out.println("Cac entry co tring setHashMap: ");
        System.out.println(setHashMap);
    }
}
