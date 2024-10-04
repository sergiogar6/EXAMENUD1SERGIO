package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {
    public void ejercicio1() {
        //Define la variable del numero y la variable para hacer el bucle que pregunte todo el rato en caso de que el numero no sea entero.
        int num = 0;
        boolean loop = true;
        Scanner entry = new Scanner(System.in);

        //Inicia el bucle y en caso de que no haya ningún error la variable loop se vuelve falsa y se rompe el bucle.
        while (loop) {
            try {
                System.out.println("Introduce un número:");
                num = entry.nextInt();
                loop = false;

            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("ERROR. Introduce un valor valido");
                entry.nextLine();
            }
        }

        //Comprueba si el número es negativo y si lo es lo multiplica por -1 para volverlo positivo (valor absoluto).
        //Y en caso de ser positivo no lo cambia
        if (num < 0) {
            num *= -1;
        }
        //Imprime por pantalla el valor absoluto.
        System.out.println("El valor absoluto es " + num);

    }



    public void ejercicio2() {

        Scanner entry = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre:");
        String name = entry.nextLine();

        System.out.println("La obra de " + name);

        //Define las medidas de los azulejos y pared preguntandolas por pantalla y las guarda con valor de coma flotante.
        System.out.println("Introduce el ancho de la pared...");
        float ancho_pared = entry.nextFloat();

        System.out.println("Introduce el largo de la pared...");
        float largo_pared = entry.nextFloat();

        System.out.println("Introduce el ancho del azulejo...");
        float ancho_azulejo = entry.nextFloat();

        System.out.println("Introduce el largo del azulejo...");
        float largo_azulejo = entry.nextFloat();

        //Calcula el area de la pared y del azulejo y las divide para saber el total de azulejos que caben el la pared.
        float resultado = (ancho_pared * largo_pared) / (ancho_azulejo * largo_azulejo);

        //Comprueba si los azulejos tienen el mismo ancho y alto (cuadrado)
        if (ancho_azulejo == largo_azulejo) {
            System.out.println("El azulejo no puede ser cuadrado.");
        }
        //Comprueba si el azulejo es mas grande que la pared
        else if (ancho_azulejo > ancho_pared || largo_azulejo > largo_pared) {
            System.out.println("El azulejo no puede ser mas grande que la pared");
        }
        //En caso de que ninguna de las dos condiciones anteriores se haya cumplido, se imprimira por pantalla el numero de azulejos necesarios.
        else {
            System.out.println("Se necesitan " + resultado + " azulejos");
        }



    }
}
