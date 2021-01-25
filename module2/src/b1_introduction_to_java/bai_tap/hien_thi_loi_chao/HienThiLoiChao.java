package b1_introduction_to_java.bai_tap.hien_thi_loi_chao;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập tên: ");
        String ten = sc.nextLine();
        System.out.println("Chào: " + ten);
    }
}
