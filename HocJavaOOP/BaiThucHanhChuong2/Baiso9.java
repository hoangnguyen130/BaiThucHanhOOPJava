import java.util.Scanner;
public class Baiso9 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        String s;
        System.out.println("Nhap vao xau s: ");
        s = scan.nextLine();
        int i, t = 0, h = 0;
        for (i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
            {
                t++;
            }
            else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
            {
                h++;
            }
        }
        System.out.println("So ki tu hoa la: " + h);
        System.out.println("So ki tu thuong la: "+ t);
    }
}