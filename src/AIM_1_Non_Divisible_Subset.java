import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;

public class AIM_1_Non_Divisible_Subset {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        BigDecimal divider = in.nextBigDecimal();

        BigDecimal[] arr = new BigDecimal[n];

        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextBigDecimal();
        }

        Map<BigDecimal, List<BigDecimal>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            BigDecimal tmpKey = arr[i].remainder(divider);
            List<BigDecimal> tmpList;
            if (map.containsKey(tmpKey)) {
                tmpList = map.get(tmpKey);
            } else
                tmpList = new ArrayList<>();
            tmpList.add(arr[i]);
            map.put(tmpKey, tmpList);
        }

        Set<BigDecimal> individables = new HashSet<>();

        boolean ilk = true;
        BigDecimal sonKey = new BigDecimal(-1);


        for (Map.Entry<BigDecimal, List<BigDecimal>> entry : map.entrySet()) {
            List<BigDecimal> val = entry.getValue();
            BigDecimal key = entry.getKey();

            if (val.size() > 1) {
                if (!key.multiply(new BigDecimal(2)).divideAndRemainder(divider)[1].equals(new BigDecimal(0))) {
                    individables.add(key);
                }
            }
            if (!ilk) {
                if (!key.add(sonKey).divideAndRemainder(divider)[1].equals(new BigDecimal(0))) {
                    individables.add(key);
                    individables.add(sonKey);
                }
            } else {
                ilk = false;
            }
            sonKey = key;
        }
        BigDecimal count = new BigDecimal(0);
        for (BigDecimal key:individables){
            count = count.add(new BigDecimal(map.get(key).size()));
        }

        System.out.println(count);
    }
}
