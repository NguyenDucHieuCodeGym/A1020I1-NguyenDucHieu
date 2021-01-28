package b6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    private double chieuCao;
    
    public Cylinder(){
    }

    public Cylinder(double radius, String color, double chieuCao) {
        super(radius, color);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double getTheTich() {
        return Math.PI * this.chieuCao * super.getBanKinh() * super.getBanKinh();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "chieuCao=" + chieuCao +
                ", theTich=" + this.getTheTich()+ '\'' +
                '}';
    }
}
