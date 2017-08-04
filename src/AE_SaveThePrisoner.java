import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AE_SaveThePrisoner {

    static int saveThePrisoner(int kackisi, int kacatlayacak, int nerdenbaslayacak) {

        int lastPrisoner = (nerdenbaslayacak + kacatlayacak - 1) % kackisi;

        if (lastPrisoner == 0)
            lastPrisoner = kackisi;

        return lastPrisoner;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
    }
}
