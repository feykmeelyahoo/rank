package Algorithms.Easy;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AE_AppleAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for (int apple_i = 0; apple_i < m; apple_i++) {
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for (int orange_i = 0; orange_i < n; orange_i++) {
            orange[orange_i] = in.nextInt();
        }
        int applesInCount = 0;
        for (int resApple : apple) {
            if ((resApple + a) >= s && (resApple + a) <= t){
                applesInCount++;
            }
        }

        int orangessInCount = 0;
        for (int resOrange : orange) {
            if ((resOrange + b) >= s && (resOrange + b) <= t){
                orangessInCount++;
            }
        }

        System.out.printf("%d\n%d", applesInCount, orangessInCount);
    }
}