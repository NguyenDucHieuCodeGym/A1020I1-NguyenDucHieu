package b14_thuat_toan_sap_xep.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5, 9, 1, 3, 2, 6, 7};
        for (int i = 1; i < array.length; i++) {
            int insert = array[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (insert < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = insert;
        }
        System.out.println(Arrays.toString(array));
    }
}

