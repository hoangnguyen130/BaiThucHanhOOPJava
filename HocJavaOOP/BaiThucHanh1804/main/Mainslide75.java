package main;

import slide75.HinhChuNhat;
import slide75.HinhHoc;
import slide75.HinhTron;

public class Mainslide75 {
    public static void main(String[] args) {
        HinhHoc hh = new HinhHoc();
        HinhTron ht1 = new HinhTron();
        HinhTron ht2 = new HinhTron();
        HinhChuNhat hcn = new HinhChuNhat();
        System.out.println("Co " + HinhHoc.dem + " hinh");
    }
}
