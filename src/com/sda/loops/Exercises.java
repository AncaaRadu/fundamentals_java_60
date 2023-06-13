package com.sda.loops;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {

        //sumaPrimelor5NumereDeLaTastatura();
        //afisareAPrimelor30DeNumere();
        //afisareaPrimelor10NumerePare();
        //afisareaPrimelor300DeNumereDivizibileCu3();
        //afisare10NumereDivizibileCu3Si5();
        //afisareDeLa0La100SiDeLa100La0();

    }

    public static void afisareAPrimelor30DeNumere() {
        for (int i = 0; i < 30; i++) {
            System.out.println(i);

        }
        int i = 0;
        while (i < 30) {
            System.out.println(i);
            i++;
        }
        System.out.println("-----");
        System.out.println(i);

        i = 0;
        do {
            System.out.println("do while: " + i);
            i++;
        } while (i < 30);

    }

    public static void sumaPrimelor5NumereDeLaTastatura() {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("introduceti numar");
            int numar = scanner.nextInt();
            suma += numar;
        }
        System.out.println(suma);

    }

    public static void afisareaPrimelor10NumerePare() {
        //for(int i = 1; i<=20; i++){
        //  if(i % 2 == 0){
        //    System.out.println(i);
        //}
        //}
        int i = 1;
        int contor = 0;

        while (contor < 10) {
            if (i % 2 == 0) {
                System.out.println(i);
                contor++;
            }
            i++;
        }
    }

    public static void afisareaPrimelor300DeNumereDivizibileCu3() {
        int i = 1;
        int contor = 0;
        while (contor < 300) {
            if (i % 3 == 0) {
                System.out.println(i);
                contor++;
            }
            i++;
        }

    }

    public static void afisare10NumereDivizibileCu3Si5() {
        int i = 1;
        int contor = 0;
        while (contor < 10) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                contor++;
            }
            i++;
        }
    }

    public static void afisareDeLa0La100SiDeLa100La0() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
        for (int i = 100; i >= 0; i--) {
            System.out.println(i);
        }

    }

}
