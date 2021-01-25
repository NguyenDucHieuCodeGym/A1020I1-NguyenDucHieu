package b3_mang_va_phuong_thuc_trrong_java.bai_tap.tim_phan_tu_lon_nhat;

import java.util.Scanner;

public class TimPhanTuLN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double max = 0;
        int cotMax = 0, dongMax = 0;
        System.out.println("Nhập số cột");
        int cot = input.nextInt();
        System.out.println("Nhập số dòng");
        int dong = input.nextInt();
        double arr[][] = new double[cot][dong];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Nhập giá trị arr[%d][%d] ", i, j);
                arr[i][j] = input.nextDouble();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    cotMax = i;
                    dongMax = j;
                }
            }
        }
        System.out.printf("Số lớn nhất là %f ở arr[%d][%d] ", max, cotMax, dongMax);
    }
}
