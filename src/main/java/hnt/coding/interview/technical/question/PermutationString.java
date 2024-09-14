package hnt.coding.interview.technical.question;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PermutationString {

    public static void main(String[] args) {
        String inputString = "abc";
        System.out.println("Input string: " + inputString);
        permute(inputString, "");
    }

    public static void permute(String inputString, String resultStr) {
        if (inputString.isEmpty()) {
            System.out.println(resultStr);
            return;
        }
        int stringLength = inputString.length();
        for (int i = 0; i < stringLength; i++) {
            // Pick the current character and append it to the result
            char currentChar = inputString.charAt(i);

            // Create the new string excluding the current character
            String remaining = inputString.substring(0, i) + inputString.substring(i + 1);

            // Recurse with the remaining string
            permute(remaining, resultStr + currentChar);
        }
    }



}
