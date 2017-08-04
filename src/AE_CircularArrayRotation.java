import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AE_CircularArrayRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt()%n;
        int q = in.nextInt();
        int[] a = new int[n];
        int[] resultArr = new int[n];

        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        for (int i = 0; i<n; i++){
            resultArr[i] = a[((n)-k+i)%n];
        }

        for (int a0 = 0; a0 < q; a0++) {
            int m = in.nextInt();
            System.out.println(resultArr[m]);
        }
    }
}
