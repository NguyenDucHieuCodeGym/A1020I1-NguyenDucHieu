package b2_vong_lap_trong_java.bai_tap.hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        int chon = -1;
        Scanner sc = new Scanner(System.in);
        while (chon != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            chon = sc.nextInt();

            if (chon == 1) {
                for (int i = 1; i < 4; i++) {
                    for (int j = 1; j < 10; j++) {
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
            } else if (chon == 2) {
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
            } else if (chon == 3) {
                for (int i = 7; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
            } else if (chon == 4) {
                System.out.println("Exit");
                break;
            }
        }

    }
}