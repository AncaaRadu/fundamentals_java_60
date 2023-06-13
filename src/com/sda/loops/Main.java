package com.sda.loops;

import com.sda.dataTypes.Animal;

public class Main {
//   PRIMITEVE + OBIECTE => CELE 2 CATEGORI DE TIPURI DE DATA


    // numere intregi
//    byte => [-128 -> 127]
//    short => [-32,768 -> 32,767]
//    int => [-2,147,483,648 -> 2,147,483,647]
//    long => [-2^63 -> 2^63 - 1]

    // numere cu zecimala (cu virgula)
//    float => numere cu zecimala (nu are o precizie atat de buna)
//    double => numere cu zecimala (recomandat, are precizie mai mare)

    // starea de adevar
//    boolean => true sau false

    // caractere
//     char = 'a' => a - z, 0 - 9, +,-,*,., ,

    public static void main(String[] args) {
        // int => tip de data
        int age;
//         age => numele variabilei

//      Tot timpul cand definim (declaram) o variabila pe prima pozitie
//      specificam tipul de variabila (tipul de data)

//       "=" acesta inseamna atribuire (initializare)
        age = 100;
        System.out.println(age); // (sout) => va genera linia din stanga
        age = 200;
        System.out.println(age);

        double money = 30.5;
        System.out.println(money);
        money = 500.78;
        System.out.println(money);

        char text = 'a';
        System.out.println(text);

        boolean isTrue = true;
        System.out.println(isTrue);

        boolean isFalse = false;
        System.out.println(isFalse);

        // declarare + initializare multipla
        double km = 100.0, m = 1.0, cm = 0.01, hectar = 20.0;
        System.out.println(km);
        System.out.println(m);
        System.out.println(cm);
        System.out.println(hectar);

        // OBIECT, toate obiectele se scriu cu litera mare
        String name = "Catalin Trainer SDA";

//        String => sir de caractere
        String initiala = "C";

//        REGULA!!!
//        Un obiect se initializeaza asa:
        String courseName = new String("Java from basic!");
        System.out.println(courseName);
        courseName = "1"; //
        char text2 = '1'; // folosim ' atunci cand ne referim la un singur
        // caracter, iar variabila este de tip char

    }
}
