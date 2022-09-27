package Ejercicios;

import java.util.Scanner;

public class LasVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola ,¿Como te llamas ?");
        String nombre = sc.nextLine();
        System.out.println("Es muy bonito nombre" + nombre );
        System.out.println("cual es tu apellido?");
        String apellido = sc.nextLine();
        System.out.println("Es un buen apellido  " + apellido);
        System.out.println("Encantado! " + nombre + " " + apellido );
        System.out.println("Cantos años tienes ?");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Que grande eres con "+ edad);
        System.out.println("tienes mascota ?");
        String mascota = sc.nextLine();
        System.out.println("Eso esta genial!! "+ mascota);
        System.out.println("Cuanto ganas en el trabajo ?");
        double salario = sc.nextDouble();
        System.out.println("Joee si que ganas bien" + salario);




    }
}
