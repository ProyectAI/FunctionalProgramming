package ProgramacionFuncional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PalabrasAscendentes {

    public static void main(String[] args) {

        List<String> descendente = Arrays.asList("Hola", "mucho", "gusto", "en", "conocerte");

        List<String> prueba = descendente.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(prueba);
    }




}
