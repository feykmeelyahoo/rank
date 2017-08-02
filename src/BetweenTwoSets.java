import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets {

    static int getTotalX(int[] a, int[] b) {

        int count = 0;
        int aLength = a.length - 1;

        for (int i = 1; ; i++) {
            if (a[aLength] * i <= b[0]) {
                boolean olumlu = true;
                int sayi = a[aLength] * i;

                for (int aij : a) {
                    if (sayi % aij != 0) {
                        olumlu = false;
                        continue;
                    } else {
                        for (int bij : b) {
                            if (bij % sayi != 0) {
                                olumlu = false;
                                continue;
                            }
                        }
                    }
                }
                if (olumlu)
                    count++;
            } else
                break;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for (int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}