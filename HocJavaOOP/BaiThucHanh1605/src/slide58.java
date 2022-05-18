import java.util.LinkedHashSet;
import java.util.Set;

public class slide58 {
    public static void main(String[] args) {
        Set<String> linkhashsSet = new LinkedHashSet<String>();
        linkhashsSet.add("java");
        linkhashsSet.add("C++");
        linkhashsSet.add("java");
        linkhashsSet.add("PHP");
        for (String str : linkhashsSet){
            System.out.println(str);
        }
    }
}
