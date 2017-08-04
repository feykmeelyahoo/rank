import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AE_SequenceEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        int[] a = new int[n];
//
//        for (int a_i = 0; a_i < n; a_i++) {
//            a[a_i] = in.nextInt();
//        }

//        Map<Integer, Integer> pMap = new HashMap<>();
        Map<Integer, Integer> rMyMap = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            int input = in.nextInt();
//            pMap.put(i, input);
            rMyMap.put(input, i);
        }

        for (int i = 1; i<= n; i++){
            int sonuc = rMyMap.get(rMyMap.get(i));
            System.out.println(sonuc);
        }
    }
}