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

        Set<BigDecimal> keySet = map.keySet();
        List<BigDecimal> keyList = new ArrayList<>();
        for (BigDecimal key : keySet) {
            keyList.add(key);
        }

        Set<BigDecimal> resultSet = findUndividableSet(keyList, divider);
        BigDecimal count = new BigDecimal(0);
        for (BigDecimal bd : resultSet) {
            count.add(new BigDecimal(map.get(bd).size()));
        }

        System.out.println(count);
    }

    public static Set<BigDecimal> findUndividableSet(List<BigDecimal> list, BigDecimal divider) {
        Set<BigDecimal> dividableSet = new HashSet<>();
        Set<BigDecimal> unDividableSet = new HashSet<>();
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (!(list.get(i).add(list.get(j)).divideAndRemainder(divider).equals(new BigDecimal(0)))) {
                    unDividableSet.add(new BigDecimal(i));
                    unDividableSet.add(new BigDecimal(j));
                } else {
                    dividableSet.add(new BigDecimal(i));
                    dividableSet.add(new BigDecimal(j));
                }
            }
        }
        for (BigDecimal bd : list) {
            if (!dividableSet.contains(bd)) {
                unDividableSet.add(bd);
            }
        }

        return unDividableSet;

    }
}
