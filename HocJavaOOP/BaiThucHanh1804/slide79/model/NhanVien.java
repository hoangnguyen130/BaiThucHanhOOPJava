package slide79.model;

public class NhanVien {
    protected String ten;
    protected long luong;
    public void NhanVien(){

    }
    public void NhanVien(String ten){
            this.ten = ten;
    }
    protected String loaiNhanVien(){
        return "";
    }
    public void xuatthongtin(){
        System.out.println("Nhan vien: " + ten);
        System.out.println("Loai nhan vien " + loaiNhanVien());
        System.out.println("Luong: " + luong);
    }
}    