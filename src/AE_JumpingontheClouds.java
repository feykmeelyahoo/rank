import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AE_JumpingontheClouds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt() % n;
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }

        int energy = 100;

        for (int i = k; ; i = (i + k) % n) {
            if (c[i] == 1) {
                energy -= 2;
            }

            energy -= 1;

            if (i == 0)
                break;
        }
        System.out.println(energy);
    }
}
