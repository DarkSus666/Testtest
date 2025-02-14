import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(textModifier());
    }

    public static String textModifier() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char[] inputA = input.toCharArray();
        StringBuilder input3 = new StringBuilder();
        for (int i = 0; i < inputA.length; i++) {
            if (inputA[i] != ' ') {
                input3.append(inputA[i]);
            } else if (inputA[i + 1] != ' ') {
                input3.append(inputA[i]);
            }
        }
        String input2 = new String(input3);

        char[] result = input2.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if (result[i] == '-') {
                char k = result[i + 1];
                result[i + 1] = result[i - 1];
                result[i - 1] = k;
            }
        }
        input2 = new String(result);
        String trueRes = input2.replaceAll("-", "");
        String trueRes1 = trueRes.replaceAll("\\+", "!");

        StringBuilder finalPhrase = new StringBuilder();
        int count = 0;

        for (int i = 0; i < trueRes1.length(); i++) {
            if (Character.isDigit(trueRes1.charAt(i))) {
                count += trueRes1.charAt(i) - '0';
            } else {
                finalPhrase.append(trueRes1.charAt(i));
            }
        }
        if (count != 0) {
            return new String(finalPhrase) + " " + count;
        } else {
            return new String(finalPhrase);
        }
    }
}

