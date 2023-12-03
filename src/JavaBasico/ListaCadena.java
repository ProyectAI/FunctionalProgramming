package JavaBasico;

import java.util.List;

public class ListaCadena {

    public static void main(String[] args) {
        List<String> cadena = List.of("Hola cesar", "Sebastian saldj", "Cesar soy", "Mundo", "Persona");

        long cantidadPalabras = cadena.stream()
                .mapToInt(e -> e.split(" ").length)
                .sum();

        System.out.println("La cantidad total de palabras es: " + cantidadPalabras);
    }
}