package JavaBasico;

import java.util.Arrays;
import java.util.List;

public class FiltrarNumeroParesImpares {

    public static void main(String []args){

        List<Integer> filtrar= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        filtrar.forEach(e-> {

            String resultado= (e % 2==0) ? "El numero "+ e+" es par":"El numero "+ e +" es impar";
            System.out.println(resultado);



        });


    }
}
