package hnt.coding.interview.technical.question;

import java.sql.SQLOutput;

/**
 * here are three types of edits that can be performed on strings:
 * insert x character, remove x character, or replace x character.
 * Given two strings, write a function to check if they are one edit (or zero edits) away.
 */
public class CheckStringEdit {
    public static void main(String[] args) {
        int numberOfEdit = 1;
        String input1 = "abcd";
        String input2 = "aebcd";
        checkEditX(numberOfEdit, input1, input2);
    }

    public static void checkEditX(int numberOfEdit, String input1, String input2) {
        if (input1.length() == input2.length()) {
            checkReplace(numberOfEdit, input1, input2);
        } else if (input1.length() == input2.length() + numberOfEdit) {
            checkInsertOrRemove(numberOfEdit, input1, input2);
        } else if (input1.length() == input2.length() - numberOfEdit) {
            checkInsertOrRemove(numberOfEdit, input1, input2);
        } else {
            System.out.println("FALSE");
        }
    }

    /**
     * abcde vs abcd OR abcd vs abcde
     * @param numberOfEdit
     * @param input1
     * @param input2
     */
    private static void checkInsertOrRemove(int numberOfEdit, String input1, String input2) {
        int index1 = 0;
        int index2 = 0;
        int input1Length = input1.length();
        int input2Length = input2.length();
        while(index1 < input1Length && index2 < input2Length) {
            if (input1.charAt(index1) != input2.charAt(index2)) {
                if (input1Length < input2Length) { //insert
                    index2 ++;
                } else {  //delete
                    index1 ++;
                }
            }
            char char1 = input1.charAt(index1);
            char char2 = input2.charAt(index2);
            if (char1 != char2) {
                System.out.println("FALSE");
                return;
            }
            index1++;
            index2++;
        }
        System.out.println("TRUE");
    }

    /**
     * abcde vs abcdX
     * @param numberOfEdit
     * @param input1
     * @param input2
     */
    private static void checkReplace(int numberOfEdit, String input1, String input2) {
        int length = input1.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (input1.charAt(i) != input2.charAt(i)) {
                count++;
            }
            if (count > numberOfEdit) {
                System.out.println("FALSE");
                return;
            }
        }

        System.out.println("TRUE");
    }
}
