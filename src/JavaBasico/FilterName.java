package JavaBasico;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterName {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Peralta","Cangalaya","Sam");

        List<String> name2 = name.stream().collect(Collectors.toList());
        name2.forEach(System.out::println);

    }
}
