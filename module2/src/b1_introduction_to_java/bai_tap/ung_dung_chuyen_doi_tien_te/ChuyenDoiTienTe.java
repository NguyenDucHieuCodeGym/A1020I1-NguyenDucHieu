package b1_introduction_to_java.bai_tap.ung_dung_chuyen_doi_tien_te;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double usd;
        Scanner sc = new Scanner(System.in);
        usd = sc.nextDouble();
        double tong = usd * 23000;
        System.out.println("Mời nhập số tiền USD: ");
        System.out.println("Giá trị VND: " + tong);
    }
}
