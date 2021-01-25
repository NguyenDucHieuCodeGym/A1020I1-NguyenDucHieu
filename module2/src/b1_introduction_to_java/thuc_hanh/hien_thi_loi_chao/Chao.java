package b1_introduction_to_java.thuc_hanh.hien_thi_loi_chao;

import java.util.Scanner;

public class Chao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello: " + name);
    }
}
