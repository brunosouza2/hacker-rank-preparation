package mini_max_sum;

import java.util.Arrays;
import java.util.List;

public class Result {
    // dado 5 números positivos ex: [1, 3, 5, 7, 9]
    // achar o valor mínimo e valor máximo que podem ser encontrados -
    // somando 4 dos 5 números.
    // ex mínimo: 1 + 3 + 5 + 7 = 16
    // ex máximo: 3 + 5 + 7 + 9 = 24
    //saída: 16 24
    public static void main(String[] args) {
        miniMaxSum(Arrays.asList(new Integer[]{1, 3, 5, 7, 9}));
    }

    public static void miniMaxSum(List<Integer> arr){
        int numeroMinimo = arr.get(0);
        int numeroMaximo = arr.get(0);
        int somaTotal = 0;

        for (Integer i : arr) {
            if (i < numeroMinimo) numeroMinimo = i;
            if (i > numeroMaximo) numeroMaximo = i;
            somaTotal = somaTotal + i;
        }

        System.out.println((somaTotal - numeroMaximo) + " " + (somaTotal - numeroMinimo));
    }
}
