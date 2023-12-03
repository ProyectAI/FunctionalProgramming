package ProgramacionFuncional;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumber {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Integer variable = Integer.parseInt(JOptionPane
                .showInputDialog("Ingrese un numero: "));
        for (int i=1; i<=variable; i++){
            list.add(i);
        }

        int oddSum= list.stream().filter(i-> i%2!=0).mapToInt(i->(int)Math.pow(i,2)).sum();
        System.out.println(oddSum   );



    }
}
