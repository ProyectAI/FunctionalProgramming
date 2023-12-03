package ProgramacionFuncional;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        FiltraNumerosParesDuplicarlos b = new FiltraNumerosParesDuplicarlos();
        ArrayList<Integer> listar = new ArrayList<>();


        for (int x=1; x<=20; x++){
            listar.add(x);
        }


        List<Integer> nuevo = listar.stream().
                filter(i -> i % 2==0).
                flatMap(i -> Arrays.asList(i,i).stream()).
                collect(Collectors.toList());

        System.out.println(nuevo);





    }
}
