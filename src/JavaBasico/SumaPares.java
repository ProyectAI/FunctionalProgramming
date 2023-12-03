package JavaBasico;

import java.util.List;
import java.util.stream.Collectors;

public class SumaPares {
    public static void main(String[]args){
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        int sumaCuadradosPares = list.stream()
                .filter(e -> e % 2 == 0)
                .mapToInt(x -> (int) Math.pow(x, 2))
                .sum();

        System.out.println("La suma de los cuadrados de los números pares es: " + sumaCuadradosPares);
    }
}
