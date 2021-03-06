package b7_abstract_class_va_interface.bai_tap.interface_resizeable_cho_cac_lop_hinh_hoc;

public class Square extends Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, double side) {
        super(color, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public String toString() {
        return " side = " + getSide() + " Area " + getArea();
    }

    @Override
    public void resize(double percent) {
        System.out.println("Area of Square is : ");
    }
}
