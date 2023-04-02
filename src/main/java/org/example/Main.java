package org.example;

public class Main {
    public static void main(String[] args) {}

    /**
     * Allow us to verify if all bracket and parentheses are close well
     * @param input the string you want to check
     * @return {@link Boolean}
     */
    public static boolean isBalanced(String input) {
        //we verified the size of the input
        if (null == input || ((input.length() % 2) != 0)) {
            return false;
        } else {
            char[] chars = input.toCharArray();
            for (var c : chars) {
                //We verify that we have a brackets or parentheses
                if (!( c == '[' || c == '(' || c == ']' || c == ')')) {
                    return false;
                }
            }
        }
        while ( input.contains("[]") || input.contains("()")) {
            input = input.replaceAll("\\(\\)", "")
                    .replaceAll("\\[\\]", "");
        }
        //if length equals 0 then correct expression otherwise not
        return (input.length() == 0);
    }
}