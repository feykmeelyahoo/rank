import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AIE_3_Cut_the_sticks {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> arr = new ArrayList();
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr.add(in.nextInt());
        }

        Collections.sort(arr);
        printSteps(arr);

    }

    public static void printSteps(List<Integer> arr) {
        System.out.println(arr.size());

        List<Integer> tmpArr = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            int yeniDeger = arr.get(i) - arr.get(0);
            if (yeniDeger > 0)
                tmpArr.add(yeniDeger);
        }
        int latLength = tmpArr.size();
        if (latLength > 0)
            printSteps(tmpArr);
        else
            return;
    }

}
