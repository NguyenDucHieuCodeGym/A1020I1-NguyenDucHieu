package b5_access_modifier_static_method_static_property.bai_tap.access_modifier;

public class Circle {
    private double radius = 3.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {

        return this.radius * this.radius * Math.PI;
    }
}

