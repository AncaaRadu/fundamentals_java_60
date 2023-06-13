package com.sda.exercitiiAcasa.ex4;
//Write a Java program to reverse a word: “avaJ
public class Main {
    public static void main (String[] args) {

        String str= "avaJ", nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("avaJ"); //Example word

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
    }
}