package b7_abstract_class_va_interface.bai_tap.interface_resizeable_cho_cac_lop_hinh_hoc;

public class Shape {
    String color = "red";
    public Shape(){
    }
    public Shape(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
