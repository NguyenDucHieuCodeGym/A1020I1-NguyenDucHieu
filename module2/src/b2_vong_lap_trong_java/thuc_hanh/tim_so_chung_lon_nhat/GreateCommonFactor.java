package b2_vong_lap_trong_java.thuc_hanh.tim_so_chung_lon_nhat;

public class GreateCommonFactor {
    public static void main(String[] args) {
        int a, b;
        java.util.Scanner nhap = new java.util.Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = nhap.nextInt();
        System.out.println("Enter the second number: ");
        b = nhap.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0)
            System.out.println("No greatest common factor");

        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }

        System.out.println("Greatest common factor: " + a);

    }

}