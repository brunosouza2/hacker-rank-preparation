package camel_case_4;

import java.util.Scanner;

/*
Camel Case is a naming style common in many programming languages. In Java, method and variable names typically start with a lowercase letter, with all subsequent words starting with a capital letter (example: startThread). Names of classes follow the same pattern, except that they start with a capital letter (example: BlueCar).

Your task is to write a program that creates or splits Camel Case variable, method, and class names.

Input Format

Each line of the input file will begin with an operation (S or C) followed by a semi-colon followed by M, C, or V followed by a semi-colon followed by the words you'll need to operate on.
The operation will either be S (split) or C (combine)
M indicates method, C indicates class, and V indicates variable
In the case of a split operation, the words will be a camel case method, class or variable name that you need to split into a space-delimited list of words starting with a lowercase letter.
In the case of a combine operation, the words will be a space-delimited list of words starting with lowercase letters that you need to combine into the appropriate camel case String. Methods should end with an empty set of parentheses to differentiate them from variable names.
Output Format

For each input line, your program should print either the space-delimited list of words (in the case of a split operation) or the appropriate camel case string (in the case of a combine operation).
Sample Input

S;M;plasticCup()

C;V;mobile phone

C;C;coffee machine

S;C;LargeSoftwareBook

C;M;white sheet of paper

S;V;pictureFrame

Sample Output

plastic cup

mobilePhone

CoffeeMachine

large software book

whiteSheetOfPaper()

picture frame

Explanation

Use Scanner to read in all information as if it were coming from the keyboard.

Print all information to the console using standard output (System.out.print() or System.out.println()).

Outputs must be exact (exact spaces and casing).
*/

public class Solution {

    public static void main(String[] args) {
        Scanner STDIN = new Scanner(System.in);
        while(STDIN.hasNextLine()) {
            String userInput = STDIN.nextLine();
            System.out.println(camelCase(userInput));
        }
    }

    public static String camelCase(String text){
        boolean isMethod = text.substring(text.indexOf(";")).contains("M");
        boolean isClass = text.substring(text.indexOf(";")).contains("C");
        boolean isVariable = text.substring(text.indexOf(";")).contains("V");
        String output = null;
        String[] parts;

        if (text.startsWith("S")) {
            parts = text.substring(text.lastIndexOf(";") + 1).split("(?=[A-Z])");

            if (isMethod){
                parts = text.substring(text.lastIndexOf(";") + 1, text.indexOf("(")).split("(?=[A-Z])");
                output =  String.join(" ", parts).toLowerCase();
            }
            if (isClass){
                output =  String.join(" ", parts).toLowerCase();
            }
            if (isVariable){
                output =  String.join(" ", parts).toLowerCase();
            }

            return output;
        }
        if (text.startsWith("C")) {
            String[] wordsAfterSemiColum = text.substring(text.lastIndexOf(";") + 1).split("\\s");

            if (isMethod){
                parts = wordsAfterSemiColum;

                for (int i = 1; i < parts.length; i++) {
                    parts[i] =  parts[i].substring(0, 1).toUpperCase() + parts[i].substring(1);
                }

               output =  String.join("", parts).concat("()");
            }
            if (isClass){
                parts = wordsAfterSemiColum;

                for (int i = 0; i < parts.length; i++) {
                    parts[i] =  parts[i].substring(0, 1).toUpperCase() + parts[i].substring(1);
                }

               output =  String.join("", parts);
            }
            if (isVariable){
                parts = wordsAfterSemiColum;

                for (int i = 1; i < parts.length; i++) {
                    parts[i] =  parts[i].substring(0, 1).toUpperCase() + parts[i].substring(1);
                }

                output =  String.join("", parts);
            }
        }
        return output;
    }

}
