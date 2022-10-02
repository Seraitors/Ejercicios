package LasVariables;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /* Escribe un programa que lea tres números y compruebe que todos son diferentes, es
        decir, no iguales entre sí. El programa debe imprimir un booleano (true o false).*/
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        boolean resultado= num1 == num2 && num2==num3 && num3==num1;

        System.out.println(resultado);

    }
}
