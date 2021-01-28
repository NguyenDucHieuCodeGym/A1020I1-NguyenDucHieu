package b6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

import java.rmi.UnexpectedException;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(2.0, "yello",3.0);
        System.out.println(cylinder);
    }
}
