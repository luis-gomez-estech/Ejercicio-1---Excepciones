package luis.gomez;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Como el enunciado dice, que haga suma, resta, multitplicacion "o" division,
        // entiendo con ese "o" que solo quiere realizar una operacion y no todas a la vez
        // Bueno en realidad lo habia hecho que calculara todas a la vez,
        // pero en una de las veces leyendo el enunciado para continuar he visto lo del "o"
        // y me dicho, esto si podria decir que nos piden un menu??, total lo he convertido en menu, pero bueno ya me dices como seria con menu o sin el.

        System.out.println("Elige la operacion a realizar" + "\n" +
                "1. Suma" + "\n" +
                "2. Resta" + "\n" +
                "3. Multiplicación" + "\n" +
                "4. División" + "\n");

        // Ahora vamos a las excepciones
        // Dentro de try pongo las operaciones que se van a realizar

        try {

            // Aqui recojo la opcion elegida y ahora mas adelante con un switch y el valor operacion hará una operacion u otra
            // Lo pongo dentro del try para decirle que si se introduce un numero que no sea entero o una letra, pues que nos avise con el catch a traves de InputMismatchException
            // de que debemos introducir un numero entero

            int operacion=sc.nextInt();

            // Ademas aqui he creado una validacion por lo que me has comentado esta mañana,
            // para que si se introduce un numero entero desde el 1 al 4, pues que continue el programa, y en caso de que este fuera del rango 1-4
            //pues con un else nos avise de que hemos elegido una opcion no disponible

            if (operacion>0&&operacion<5) {

                // Ahora pido los 2 numeros para hacer los calculos y los almaceno
                System.out.println("Introduce el primer numero entero");
                int numero1 = sc.nextInt();
                System.out.println("Introduce el segundo numero entero");
                int numero2 = sc.nextInt();

                //Cerramos scanner
                sc.close();

                // switch para elegir realizar la operacion que hayaos introducido por teclado al iniciar el programa
                switch (operacion) {
                    case 1:
                        System.out.println("La suma de " + numero1 + " + " + numero2 + " es: " + (numero1 + numero2));
                        break;
                    case 2:
                        System.out.println("La resta de " + numero1 + " - " + numero2 + " es: " + (numero1 - numero2));
                        break;
                    case 3:
                        System.out.println("La multiplicacion de " + numero1 + " x " + numero2 + " es: " + (numero1 * numero2));
                        break;
                    case 4:
                        System.out.println("La division de " + numero1 + " entre " + numero2 + " es: " + (numero1 / numero2));
                        break;
                }

            } else {
                System.out.println("Has introducido una opcion no disponible");
            }

            //Ahora el catch, he puesto InputMismatchException que seria la excepcion que nos marca el programa cuando
            // estamos pidiendo por teclado un numero entero int y en vez de introducir un numero entero,
            // introducimos por ejemplo un numero deciaml o un texto, y la llamo e.
            // Seguidamente pongo un mensaje para indicar que esta ocurriendo
            // Por tanto este catch lo estoy usando tanto para cuando se introduce una letra como opcion a elegir en el menu
            //y tambien para cuando nos pide los numeros a operar e introducimos numeros decimales o letras en vez de numeros enteros

        } catch (InputMismatchException e) {

            System.out.println("Debes de introducir un numero entero para que se puedan realizar operaciones");

        }


    }
}


