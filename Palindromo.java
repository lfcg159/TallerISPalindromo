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

    static void esPalindromo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un texto (maximo: 500 caracteres): ");
        String cadena = sc.nextLine();
        System.out.println("\n");
        int contadorCaracteres = 1;
        int totalCaracteres = 0;
        for (int i = 0; i < cadena.length(); i++) {
            totalCaracteres = contadorCaracteres++;
        }
        if (totalCaracteres <= 500) {
            String[] vecPalabras = cadena.split(" ");
            int contadorPalindromos = 0;
            for (String vecPalabra : vecPalabras) {
                StringBuffer revesCadena = new StringBuffer(vecPalabra);
                revesCadena.reverse();
                if (vecPalabra.equalsIgnoreCase(String.valueOf(revesCadena))) {
                    System.out.println(vecPalabra + " Es un palindromo");
                    contadorPalindromos++;
                } else {
                    System.out.println(vecPalabra + " No es palindromo");
                }
            }
            System.out.println("\n Total de palindromos: " + contadorPalindromos);
        } else {
            System.out.println("El texto o palabra ingresado supera el limite de 500 caracteres, por favor intenta de nuevo.");
        }
    }

    public static void main(String[] args) {
        esPalindromo();
    }
}
