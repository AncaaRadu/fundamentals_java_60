package com.sda.exercitii.ex5;

//introduc de la tastatura 3 nr a, b, c
//sa se afiseze cele 3 numere in ordine crescatoare =
//daca introducem a = 5, b = 0, c = 3, sa se afiseze 0, 3, 5


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti a: ");
        int a = scanner.nextInt();
        System.out.println("Introduceti b: ");
        int b = scanner.nextInt();
        System.out.println("Introduceti c: ");
        int c = scanner.nextInt();

        int a1, b1, c1;
        if (a >= b) {
            int temp = a;
            a = b;
            b = temp;


        }
        if (a >= c){
            int temp = a;
            a = c;
            c = temp;

        }
        if (b >= c){
            int temp = b;
            b = c;
            c = temp;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
