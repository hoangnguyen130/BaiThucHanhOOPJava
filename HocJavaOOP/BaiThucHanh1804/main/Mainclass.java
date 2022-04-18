package main;
import shapes.HinhChuNhat;
import shapes.HinhTron;
import shapes.HinhTru;
import shapes.HinhVuong;


public class Mainclass {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.xuatten();
        ht.nhapBanKinh();
        ht.tinhchuvi();
        ht.tinhdientich();
        ht.inchuvi();
        ht.indientich();

        HinhChuNhat hcn = new HinhChuNhat();
        hcn.xuatten();
        hcn.nhapchieudai();
        hcn.nhapchieurong();
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.inchuvi();
        hcn.indientich();

        HinhTru htru = new HinhTru();
        htru.xuatten();
        htru.nhapchieucao();
        htru.tinhthetich();
        htru.inthetich();

        HinhVuong hv = new HinhVuong();
        hv.xuatten();
        hv.nhapcanh();
        hv.tinhchuvi();
        hv.tinhdientich();
        hv.inchuvi();
        hv.indientich();
        
    }    
}
