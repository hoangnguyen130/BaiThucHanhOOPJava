package main;
import slide72.SinhVien;
public class Mainslide72 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.setten("");
        sv1.settuoi(23);
        sv2.setten("Peter");
        sv2.settuoi(17);
        System.out.println("Sinh vien 1 ten: " + sv1.getten() + "\nTuoi: " + sv1.gettuoi());
        System.out.println("Sinh vien 2 ten: " + sv2.getten() + "\nTuoi: " + sv2.gettuoi());
    }
}
