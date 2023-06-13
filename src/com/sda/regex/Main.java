package com.sda.regex;

import java.util.regex.Pattern;

public class Main {
        public static void main (String[] args) {
            String textRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
            String email = "test@test.com";

            boolean isMatched = true;

            isMatched = Pattern
                    .compile(textRegex)
                    .matcher(email)
                    .matches();

            System.out.println(isMatched);
        }
}
