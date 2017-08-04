package Algorithms.Easy;

import java.util.Scanner;

/**
 * Created by innuendo on 8/2/17.
 */

enum MyDirection {
    RIGHT, LEFT
}

public class AE_Ex3 {
    static int diagRightArraySum(int n, int[][] ar) {
        // Complete this function

        int SumRight = 0;
        int SumLeft = 0;

        for (MyDirection direction : MyDirection.values()) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (direction == MyDirection.RIGHT) {
                        if (i == j) {
                            SumRight += ar[i][j];
                        }
                    } else {
                        if (i + j == n - 1) {
                            SumLeft += ar[i][j];
                        }
                    }
                    System.out.println(ar[i][j]);
                }
            }
        }
        return Math.abs(SumRight - SumLeft);
    }

//    static int diagArraySum(int n, int[][] ar) {
//        // Complete this function
//        for (int[] k1 : ar) {
//            for (int k11 : k1) {
//                System.out.println(k11);
//            }
//        }
////        simpleArraySum(ar.length()-1,
//        return 0;
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] ar = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = in.nextInt();
            }
        }
        int result = diagRightArraySum(n, ar);
        System.out.println(result);
    }
}
