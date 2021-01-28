package b6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Circle {
    private double banKinh;
    private String mauSac;

    public Circle() {
    }

    public Circle(double banKinh, String mauSac) {
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public double getDienTich() {
        return Math.PI * this.banKinh * this.banKinh;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "banKinh=" + banKinh +
                ", mauSac='" + mauSac + '\'' +
                ", dienTich=" + this.getDienTich()+ '\'' +
        '}';
    }
}
