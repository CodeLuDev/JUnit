package org.example.entity;
/*
Español
Generador de Contraseñas Seguras:
Crea una clase SecurePasswordGenerator que genere contraseñas seguras con ciertos
requisitos (por ejemplo, longitud mínima, combinación de caracteres, etc.).
Escribe pruebas unitarias para asegurarte de que el generador de contraseñas seguras
cumpla con los requisitos establecidos y produzca contraseñas seguras.

English
Secure Password Generator:
Create a SecurePasswordGenerator class that generates secure passwords with certain
requirements (for example, minimum length, combination of characters, etc.).
Write unit tests to ensure that the strong password generator
comply with the established requirements and produce strong passwords.
 */

import java.util.Random;

public class SecurePasswordGenerator {

    private static final String SYMBOLS = "!@#$%^&*()-_=+[]{}|;:,.<>?";
    private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";

    public String passwordGenerator() {

        Random random = new Random();
        StringBuilder password = new StringBuilder();
        String allCharacters = SYMBOLS + UPPER_CASE + LOWER_CASE + NUMBERS;

        int lenghtPassword = random.nextInt(12-8+1)+8; //min lenght = 8 / max lenght = 12

        for (int i=0; i<lenghtPassword; i++) {

            int randomIndex = random.nextInt(allCharacters.length()); //created a random index chosen with random method with allCharacters.length()
            password.append(allCharacters.charAt(randomIndex)); //append means "add", so we put the letter, symbol or number correspondent to the random index

        }

        return password.toString();
    }
}
