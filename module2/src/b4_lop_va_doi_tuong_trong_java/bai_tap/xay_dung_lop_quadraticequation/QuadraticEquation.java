package b4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_quadraticequation;

public class QuadraticEquation {
    private double a, b, c;
    private double delta;
    private double x1, x2;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = (b * b) - (4 * a * c);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return delta = (this.b * this.b) - (4 * this.a * this.c);
    }

    public double getRoot1() {
        return x1 = ((-this.b) + Math.sqrt(delta)) / 2 * this.a;
    }

    public double getRoot2() {
        return x2 = ((-this.b) - Math.sqrt(delta)) / 2 * this.a;
    }
}
