package entity;

import org.example.entity.SecurePasswordGenerator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SecurePasswordGeneratorTest {
    static SecurePasswordGenerator securePasswordGenerator;
    static String generatedPassword;

    @BeforeAll
    public static void setUp() {
        securePasswordGenerator = new SecurePasswordGenerator();
        
        generatedPassword = securePasswordGenerator.passwordGenerator();
        System.out.println("Password generated is: " + generatedPassword);
    }

    @Test
    public void passwordLengthTest() {
        Assertions.assertTrue(generatedPassword.length() >= 8);
    }

    @Test
    public void containsSymbolsTest() {
        Assertions.assertTrue(generatedPassword.matches(".*[!@#$%^&*()\\\\\\-_=+\\\\[\\\\]{}|;:,.<>?].*"));
    }

    @Test
    public void containsUpperLetterTest() {
        Assertions.assertTrue(generatedPassword.matches(".*[A-Z].*"));
    }

    @Test
    public void containsLowerLetterTest() {
        Assertions.assertTrue(generatedPassword.matches(".*[a-z].*"));
    }

    @Test
    public void containsNumberTest() {
        Assertions.assertTrue(generatedPassword.matches(".*\\d.*"));
    }
}
