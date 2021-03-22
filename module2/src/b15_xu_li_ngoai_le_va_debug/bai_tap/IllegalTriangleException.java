package b15_xu_li_ngoai_le_va_debug.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 3 cạnh của tam giác: ");
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập c: ");
        int c = scanner.nextInt();
        try {
            if (kTTamGiac(a, b, c)) {
                System.out.println("Đúng");
            } else {
                System.out.println("Sai");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static boolean kTTamGiac(int a, int b, int c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new Exception("Số nhập vào nhỏ hơn 0 ");
        } else if (a + b < c || a + c < b || b + c < a) {
            throw new Exception("Hai cạnh nhỏ hơn cạnh còn lại");
        }
        return true;
    }
}