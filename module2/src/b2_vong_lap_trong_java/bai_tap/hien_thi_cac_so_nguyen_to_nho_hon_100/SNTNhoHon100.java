package b2_vong_lap_trong_java.bai_tap.hien_thi_cac_so_nguyen_to_nho_hon_100;

import java.util.Scanner;

public class SNTNhoHon100 {
    public static void main(String[] args) {
        System.out.printf("số nguyên tố nhỏ hơn 100 là: \n");
        int i = 0;
        while (i <= 50) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }


    public static boolean isPrimeNumber(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
}