import java.util.Scanner;
public class slide40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ngay;
        System.out.println("nhap vao so ngay: ");
        ngay = scan.nextInt(); 
        switch (ngay){
            case 20: System.out.println("chu nhat");
            break;
            case 21: System.out.println("thu hai");
            break;
            case 22: System.out.println("thu ba");
            break;
            case 23: System.out.println("thu tu");
            break;
            case 24: System.out.println("thu nam");
            break;
            case 25: System.out.println("thu sau");
            break;
            case 26: System.out.println("thu bay");
            break;
        };


    };
}
