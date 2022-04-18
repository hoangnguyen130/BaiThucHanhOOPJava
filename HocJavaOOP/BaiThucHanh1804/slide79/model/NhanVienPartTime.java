package slide79.model;

import slide79.until.configs;

public class NhanVienPartTime extends NhanVien {
    private int sogiolamviec;
    public NhanVienPartTime(String ten, int sogiolamviec){
        this.ten = ten;
        this.sogiolamviec = sogiolamviec;

    }
    public String loaiNhanVien(){
        return "Nhan vien thoi vu";
    }
    public void tinhluong(){
        luong = configs.Luong_Part_Time_Moi_Gio * sogiolamviec;
    }
}
