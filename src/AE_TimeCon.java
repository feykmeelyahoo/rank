import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AE_TimeCon {

    static String timeConversion(String s) {
        // Complete this function
        String result = new String();

        if (s.contains("AM")) {
            result = s.replace("AM", "");
            String[] strL = result.split(":");
            if (strL[0].contains("12")) {
                strL[0] = "00";
                result = "";
                for (int i = 0; i < strL.length; i++) {
                    result += strL[i];
                    if (i != strL.length - 1)
                        result += ":";
                }
            }
        } else if (s.contains("PM")) {
            result = s.replace("PM", "");
            String[] strL = result.split(":");
            if (!strL[0].contains("12")) {
                int aa = Integer.parseInt(strL[0]);
                strL[0] = Integer.toString(aa + 12);
                result = "";
                for (int i = 0; i < strL.length; i++) {
                    result += strL[i];
                    if (i != strL.length - 1)
                        result += ":";
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
