import java.util.Scanner;
public class slide30 {
    public static void main(String[] args ) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap vao n:");
        int n;
        n = scan.nextInt();
        int sum = 0;
        while (n > 0)
        {
            sum += n % 10;
            n /= 10;

        }
    
        System.out.println("sum: "+ sum);
    }

    }
