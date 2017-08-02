import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        String result = "NO";
        int fark = Math.abs((x1) - (x2));
        if (fark==0){
            result = "YES";
            return result;
        }

        for (int i = 0; ; i++) {
            int yeniFark = Math.abs((x1 + v1 * i) - (x2 + v2 * i));

            if (yeniFark == 0)
                result = "YES";
            else if (yeniFark >= fark && i!=0)
                break;
            else
                fark = yeniFark;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}