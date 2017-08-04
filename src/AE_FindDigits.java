import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AE_FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }

        for (int i : c) {
            int[] arr = findDigits(i);
            int count = 0;
            for (int j : arr) {
                if (j != 0 && i % j == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }

    public static int[] findDigits(int sayi) {
        int tmp = sayi;
        List<Integer> list = new ArrayList<>();
        while (tmp >= 1) {
            list.add(tmp % 10);
            tmp /= 10;
        }
        return list.stream().mapToInt(i -> i).toArray();

    }
}
