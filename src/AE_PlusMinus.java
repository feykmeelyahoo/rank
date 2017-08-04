import java.util.Scanner;

/**
 * Created by innuendo on 8/2/17.
 */
public class AE_PlusMinus {

    public static void main(String[] ar1gs) {
        Double Pos = 0.0;
        Double Neg = 0.0;
        Double Zer = 0.0;

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        int n = 5;
        int[] ar1 = new int[n];
        for (int ar1_i = 0; ar1_i < n; ar1_i++) {
            ar1[ar1_i] = in.nextInt();
            if (ar1[ar1_i] == 0) {
                Zer+=1.0;
            } else if (ar1[ar1_i] > 0) {
                Pos+=1.0;
            } else {
                Neg+=1.0;
            }
//            ar1[ar1_i] = (ar1_i+1) *100 -1;
        }

        System.out.printf("%.6f\n", (Pos) / n);
        System.out.printf("%.6f\n", (Neg) / n);
        System.out.printf("%.6f\n", (Zer) / n);
    }
}
