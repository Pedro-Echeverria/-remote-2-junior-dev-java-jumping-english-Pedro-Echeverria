package template.jumping.excercice.java;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        
        String arrayObstacles = args[0];               
        //Convierto el argumento ingresado en un array de enteros
        String[] parametros =  arrayObstacles.split(",");
        int[] arreglo = Arrays.stream(parametros)
                        .mapToInt(Integer::parseInt)
                        .toArray();
        
        //el salto minimo es de 2                       
        Integer minimumJump = 2;       
        int i=0;
        while(i<arreglo.length)
        {               
            for(i = 0;i<arreglo.length;i++)
            {
                //Pregunto si los multiplos de los saltos estan dentro del array (ocupados)
                if(arreglo[i]%minimumJump==0)
                {
                    minimumJump++;//cambio el valor del salto
                    break;//si es asi reinicio el ciclo con el nuevo salto
                }
            }
        }
       
        
        //TODO: Implement solution
        
        
        
        
        System.out.println("The minimum jump to avoid all obstacles is: " + minimumJump);
    }

    public String getGreeting() {
        return "Hello World!";
    }
}
