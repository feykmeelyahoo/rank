import java.util.Scanner;

public class AE_BeautifulDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int count = 0;

        for (int sayi = i; sayi<=j; sayi++){
            int degerlendir = sayi;
            String result = new String("");

            while (degerlendir>0){
                int tmp = (degerlendir%10);
                result+=tmp;
//                System.out.println(" - "+ result);
////                System.out.println(" - "+ Integer.toString(degerlendir));
//
////                System.out.println(sayi);
                degerlendir = degerlendir/10;
            }

            if ((sayi - Integer.parseInt(result))%k==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
