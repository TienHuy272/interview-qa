package hnt.coding.interview.technical.question;

public class TwoStringPermutation {
    public static void main(String[] args) {
        String input1 = "abfcdfeg";
        String input2 = "abdcefgf";

        int[] letters = new int[128];
        char[] input1Chars = input1.toCharArray();
        for (char c : input1Chars) {
            letters[c]++;
        }

        int length = input2.length();
        for (int i = 0; i < length; i++) {
            char c = input2.charAt(i);
            letters[c]--;
            if (letters[c] < 0) {
                System.out.println("Not Permutation");
                return;
            }
        }
        System.out.println("Permutation");
    }
}
