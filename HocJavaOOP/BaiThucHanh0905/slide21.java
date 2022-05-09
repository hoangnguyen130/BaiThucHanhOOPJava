import java.util.ArrayList;

public class slide21 {
    public static void main(String[] args) {
        ArrayList<String> arrlistcolor = new ArrayList<>();
        arrlistcolor.add("red");
        arrlistcolor.add("blue");
        arrlistcolor.add("black");
        arrlistcolor.add("green");
        arrlistcolor.add("yellow");
        System.out.println(arrlistcolor.get(1));
        System.out.println(arrlistcolor.contains("yellow"));
        System.out.println(arrlistcolor.size());
        System.out.println(arrlistcolor);
    }
}
