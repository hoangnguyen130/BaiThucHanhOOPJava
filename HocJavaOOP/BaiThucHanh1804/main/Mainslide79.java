package main;

import slide79.model.NhanVienFullTime;
import slide79.model.NhanVienPartTime;
import slide79.until.configs;

public class Mainslide79 {
    public static void main(String[] args) {
        NhanVienFullTime sep = new NhanVienFullTime("Sep");
        sep.setLoaiChucVu(configs.Sep);
        NhanVienPartTime thoivu = new NhanVienPartTime("Thoi Vu", 110);
        NhanVienFullTime linh1 = new NhanVienFullTime("Linh1");
        NhanVienFullTime linh2 = new NhanVienFullTime("Linh2", 5);
        sep.tinhluong();
        linh1.tinhluong();
        linh2.tinhluong();
        thoivu.tinhluong();
        sep.xuatthongtin();
        linh1.xuatthongtin();
        linh2.xuatthongtin();
        thoivu.xuatthongtin();

    }   
}
