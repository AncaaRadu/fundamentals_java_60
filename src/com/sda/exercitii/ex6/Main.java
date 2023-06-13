package com.sda.exercitii.ex6;


//sa se introduca 10 numere de la tastatura pe care le salvam intr un array
//sa se introduca un nr x de la tastatura si sa se verifice daca exista in array
//daca da, sa se afiseze "Numarul a fost gasit", altfel "Numarul nu a fost gasit"

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nrCitit = new Scanner(System.in);
        int[] numereCitite = new int[10];

        for(int i=0; i< numereCitite.length; i++){
            System.out.println("Introduceti numarul: ");
            numereCitite[i] = nrCitit.nextInt();
        }

        System.out.println("Introduceti numarul pentru verificare: ");
        int x = nrCitit.nextInt();
        boolean gasit = false;

        for(int i=0; i< numereCitite.length; i++){
            if (x == numereCitite[i]){
                gasit = true;
            }
        }

        if (gasit) {
            System.out.println("Numarul a fost gasit");
        }else{
            System.out.println("Numarul nu a fost gasit");
        }

    }

}
