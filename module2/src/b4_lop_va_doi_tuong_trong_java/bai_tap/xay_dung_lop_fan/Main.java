package b4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.fast, 10, "yellow", true);
        Fan fan2 = new Fan(Fan.medium, 5 ,"blue", false);
        System.out.println("fan1: "+fan1);
        System.out.println("fan2: "+fan2);
    }
}
