package plus_minus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Result {

    public static void main(String[] args) {
   plusMinus(Arrays.asList(-4, 3, -9, 0, 4, 1));

    }

    public static void plusMinus(List<Integer> arr) {
       int positive = 0;
       int negative = 0;
       int zero = 0;

        for (Integer i : arr) {
            if(i > 0) {
                positive++;
            }
            if (i < 0) {
                negative++;
            }
            if (i == 0) {
                zero++;
            }
        }

        System.out.printf("%.6f%n%.6f%n%.6f%n",(double) positive/arr.size(),
                (double) negative/arr.size(), (double) zero/arr.size());
    }


}
