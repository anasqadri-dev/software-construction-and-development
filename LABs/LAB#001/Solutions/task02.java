import java.util.Scanner;
public class task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Symbol: ");
        char c = input.next().charAt(0);
        int symbol = (int)c;
        System.out.println("The Ascii for the character '"+c+"' is: " + symbol);
        input.close();
    }
}