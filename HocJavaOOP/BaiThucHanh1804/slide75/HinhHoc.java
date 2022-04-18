package slide75;

public class HinhHoc {
    public static int dem = 0;
    public HinhHoc(){
            dem++;
    }
    public float PI = 3.14f;
    public String name;
    public float chuvi;
    public float dientich;
    public float thetich;
    public void xuatten(){
        System.out.println(name);
    }
    public void inchuvi(){
        System.out.println("Chu vi:" + chuvi);
    }
    public void indientich(){
        System.out.println("Dien tich:" + dientich);
    }
    public void inthetich(){
        System.out.println("The tich:" + thetich);
    }
}
