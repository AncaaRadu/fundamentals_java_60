package com.sda.exercitii.ex1;

import java.util.Scanner;

/**
 * sa se introduca de la tastatura 10 numere intregi pe care le vom salva intr-un array.
 * Pentru fiecare element din array vom verifica daca elementul este numar par sau impar si vom afisa:
 * daca este par afisam: nr - par;
 * daca este impar afisam: nr - impar.
 */
public class Main {
    public static void main(String[] args) {
        Scanner anca = new Scanner(System.in);

        int[] sirNumere = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("introduceti numar: ");
            int nr = anca.nextInt();
            //Setam numaril introdus de ka tastatura in array
            sirNumere[i] = nr;
        }
        for (int i = 0; i < sirNumere.length; i++) {
            //Luam un element din array si il setam intr-o variabila.
            int element = sirNumere[i];
            if (element % 2 == 0) {
                System.out.println(element + "- par");
            } else {
                System.out.println(element + "- impar");
            }

        }
    }

}
