package hnt.coding.interview.core.functional.inteface;

import java.util.function.Predicate;

public class PasswordValidationExample {
    public static Predicate<String> isLengthValid = password -> password.length() >= 8;
    public static Predicate<String> containsSpecialChar = password -> password.matches(".*[!@#$%^&*()].*");
    public static Predicate<String> containsUpperCase = password -> password.matches(".*[A-Z].*");

    public static void main(String[] args) {
        String password = "Passw0rd!";

        boolean isPasswordStrong = isLengthValid
                .and(containsSpecialChar)
                .and(containsUpperCase)
                .test(password);

        System.out.println("Is the password strong? " + isPasswordStrong);
    }
}