package time_conversion;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Result {

    //Recebe um input no formato 12 horas como: 12:00:00AM e deve sair no formato 24h ex: 00:01:00

    public static void main(String[] args) {
        System.out.println(timeConversion("12:01:00AM"));

    }
    // LocalTime trabalha com formato 24h por default, o que me permite apenas formatar a saída
    // pois a conversão é feita automáticamente
    public static String timeConversion(String s) {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("hh:mm:ssa");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = LocalTime.parse(s, inputFormatter);
        return time.format(outputFormatter);
    }
}
