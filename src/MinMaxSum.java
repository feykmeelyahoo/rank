import java.util.Scanner;

/**
 * Created by innuendo on 8/2/17.
 */
public class MinMaxSum {

    public static void main(String[] ar1gs) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        int n = 5;
        long[] arr = new long[5];
        long[] sumArr = new long[5];

        long little = 0L, big = 0L;

        for (int arr_i = 0; arr_i < 5; arr_i++) {
            arr[arr_i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j)
                    sumArr[i] += arr[j];
            }
            if (i == 0) {
                little = sumArr[i];
                big = sumArr[i];
            }
            if (little > sumArr[i])
                little = sumArr[i];
            if (big < sumArr[i])
                big = sumArr[i];
        }
        System.out.printf("%d %d", little, big);
    }
}