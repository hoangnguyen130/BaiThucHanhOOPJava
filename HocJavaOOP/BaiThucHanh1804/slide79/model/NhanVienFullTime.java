package slide79.model;

import slide79.until.configs;

public class NhanVienFullTime extends NhanVien {
    private int ngaylamthem;
    public NhanVienFullTime(String ten){
        this.ten = ten;
    }
    public NhanVienFullTime(String ten, int ngaylamthem){
        this.ten = ten;
        this.ngaylamthem = ngaylamthem;
    }
    public void setLoaiChucVu(int LoaiChucVu){
        
    }
    public String loaiNhanVien(){
        return "Nhan vien chinh thuc";
    }
    public void tinhluong(){
        luong = configs.Luong_Sep_Full_Time + configs.Luong_Lam_Them_Moi_Ngay * ngaylamthem;
    }
}
