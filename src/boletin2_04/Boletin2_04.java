package boletin2_04;

import java.util.Scanner;

public class Boletin2_04 {

    public static void main(String[] args) {
       Scanner teclado= new Scanner(System.in);
        float n1, n2, suma, resta, producto, cociente;
        System.out.println("introduce N1");
        n1= teclado.nextFloat();
        System.out.println("introduce N2");
        n2= teclado.nextFloat();
        System.out.println("Calculando...");
        suma=n1+n2;
        resta=n1-n2;
        producto=n1*n2;
        cociente=n1/n2;
        System.out.println("suma = "+suma+"\nresta = "+resta+"\nproducto = "+producto+"\ncociente = "+cociente);
    }
    
}
