/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author CCA
 */
public class Palindromo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un texto (maximo: 500 caracteres): ");
        String cadena = sc.nextLine();
        System.out.println("\n");
        int Contador2 = 1;
        int totalCaracteres = 0;
        for (int i = 0; i < cadena.length(); i++) {
            totalCaracteres = Contador2++;
        }
        if (totalCaracteres <= 500) {
            String[] vecPalabras = cadena.split(" ");
            int contador = 0;
            for (int i = 0; i < vecPalabras.length; i++) {
                StringBuffer revesCadena = new StringBuffer(vecPalabras[i]);
                revesCadena.reverse();
                if (vecPalabras[i].equals(String.valueOf(revesCadena))) {
                    System.out.println(vecPalabras[i] + " Es un palindromo");
                    contador++;
                } else {
                    System.out.println(vecPalabras[i] + " No es palindromo");
                }
            }
            System.out.println("\n Total de palindromos: " + contador);
        } else {
            System.out.println("El texto o palabra ingresado supera el limite de 500 caracteres, por favor intenta de nuevo.");
        }
    }
}
