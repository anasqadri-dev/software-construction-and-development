import java.util.Scanner;
public class task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Character to check if vowel or something else: ");
        char userInput = input.next().charAt(0);
        switch (Character.toLowerCase(userInput)) {
            case 'a','e','i','o','u':
                System.out.println(userInput + " IT IS A VOWEL!!!!!");
                break;
            case 'w','y':
                System.out.println(userInput + " IT IS A SEMI VOWEL!!!!!");
                break;
            default:
                if (Character.isLetter(userInput)) {
                    System.out.println(userInput + " IT IS A CONSONANT!!!!!");
                } else {
                    System.out.println(userInput + " IT IS A SYMBOL!!");
                }
        }
        input.close();
    }
}