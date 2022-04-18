package slide71;

public class HinhTron {
    private final float PI = 3.14f;
    private float BanKinh;

    public float getBanKinh(){
        return BanKinh;
    }
    public void setBanKinh(float BanKinh){
        this.BanKinh = BanKinh;
    }
    public float tinhchuvi(){
        return 2 * PI * BanKinh;
    }
    public float tinhdientich(){
        return PI * BanKinh * BanKinh;
    }
}