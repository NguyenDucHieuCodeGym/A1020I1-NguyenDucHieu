package b7_abstract_class_va_interface.bai_tap.interface_resizeable_cho_cac_lop_hinh_hoc;

public class Circle extends Shape implements Resizeable {
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public void setArea(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.color +
                " Circle{" +
                " radius = " + radius +
                '\'' +
                " & Area = " + getArea() +
                '}';
    }

    @Override
    public void resize(double percent) {
        System.out.println("Area of Circle " + getArea() * percent);
    }
}
