package b4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_stopwatch;

public class Main {

    public static int[] selectionSort(int... a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int tempt = a[i];
                    a[i] = a[j];
                    a[j] = tempt;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = new int[100000];
        for (int i = 0; i < 100000; i++) {
            a[i] = (int) (Math.random() * 1000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(a);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}



