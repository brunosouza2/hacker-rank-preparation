package breaking_the_records;

import java.util.Arrays;
import java.util.List;

public class Result {

    public static void main(String[] args) {
        List<Integer> scores = breakingRecords(Arrays.asList(12, 24, 10, 24));
        System.out.printf(scores.get(0) + " " +  scores.get(1));

    }

    // Example: [12, 24, 10, 24]
    // Minimum | Maximum | min | max
    //    12       12       0     0
    //    12       24       0     1
    //    10       24       1     1
    //    10       24       1     1

    // Retorno no index[0] deve ser contagem do mínimo
    // Retorno no index[1] deve ser contagem do máximo

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int minimo = scores.get(0);
        int maximo = scores.get(0);
        int countMin = 0;
        int countMax = 0;

        for (Integer score : scores) {
            if (score > maximo) {
                maximo = score;
                countMax++;
            }
            if (score < minimo) {
                minimo = score;
                countMin++;
            }
        }

        return Arrays.asList(countMax, countMin);
    }

}
