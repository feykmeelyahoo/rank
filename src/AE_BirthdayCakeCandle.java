import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AE_BirthdayCakeCandle {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int count = 0;
        int max = 0;

        for (int i : ar) {
            if (i > max) {
                count = 1;
                max = i;
            } else if (i == max)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
