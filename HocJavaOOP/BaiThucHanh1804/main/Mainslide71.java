package main;
import slide71.HinhTron;
public class Mainslide71 {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.setBanKinh(10);
        float chuvi = ht.tinhchuvi();
        float dientich = ht.tinhdientich();
        System.out.println("Chu vi hinh tron: " + chuvi + "\nDien tich hinh tron: " + dientich);
    }
}
