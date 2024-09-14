package hnt.coding.interview.technical.question;

/**
 *  Implement a method to perform basic string compression using the counts of repeated characters.
 *  For example, the string aabcccccaaa would become a2blc5a3.
 *  If the "compressed" string would not become smaller than the original string, your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 */
public class StringCompression {
    public static void main(String[] args) {
        String input = "aabbccddeeee";
        int count = 0;
        int length = input.length();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            count++;
            if ((i + 1 == length) || (input.charAt(i) != input.charAt(i + 1))){
                builder.append(input.charAt(i));
                builder.append(count);
                count = 0;
            }
        }
        System.out.println(builder);
    }
}
