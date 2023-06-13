package com.sda.exercitii.ex2;

import java.lang.reflect.Array;

/**
 * Sa se numere cate vocale sunt in textul urmator.
 * Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
 * Vocalele sunt: A, E, I, O, U.
 * 1. punem textul intr o variabila de tipul string;
 * 2. pentru fiecare caracter din string (charAt(i)) verificam daca e vocala;
 * 3. daca e vocala atunci contorizam intr-o variabila;
 * 4. afisam contorul dupa parcurgerea stringului.
 */
public class Main {
    public static void main(String[] args) {

        String textDeVerificat = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        int contor = 0;
        int contorA = 0, contorE = 0, contorI = 0, contorO = 0, contorU = 0;
        textDeVerificat = textDeVerificat.toLowerCase();
        for (int i = 0; i < textDeVerificat.length(); i++) {
            if (textDeVerificat.charAt(i) == 'a') {
                contorA++;
            }
            if (textDeVerificat.charAt(i) == 'e') {
                contorE++;
            }
            if (textDeVerificat.charAt(i) == 'i') {
                contorI++;
            }
            if (textDeVerificat.charAt(i) == 'o') {
                contorO++;
            }
            if (textDeVerificat.charAt(i) == 'u') {
                contorU++;
            }
        }

        System.out.println(contorA + " - a");
        System.out.println(contorE + " - e");
        System.out.println(contorI + " - i");
        System.out.println(contorO + " - o");
        System.out.println(contorU + " - u");


    }

}
