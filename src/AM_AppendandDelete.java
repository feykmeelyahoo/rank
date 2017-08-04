import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AM_AppendandDelete {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();

        int islemSayisi = 0;
        int farklıElemanIndex = (s.length() > t.length() ? t.length() : s.length());

        islemSayisi += s.length() - (farklıElemanIndex);

        int kalanIslemSayisi = k - islemSayisi;

        if (kalanIslemSayisi >= farklıElemanIndex + t.length()) {
            System.out.println("Yes");
            return;
        } else if (t.length() - (farklıElemanIndex) <= kalanIslemSayisi) {
            if ((t.length() - (farklıElemanIndex) - kalanIslemSayisi) % 2 == 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        } else
            System.out.println("No");
    }
}
