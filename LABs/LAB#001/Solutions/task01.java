import java.util.Scanner;
class task01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 01: ");
        int num1 = input.nextInt();
        System.out.print("Enter Number 02: ");
        int num2 = input.nextInt();

        // Swapping Logic
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After Swapping");

        System.out.println("Number 01 is: " + num1);
        System.out.println("Number 02 is: " + num2);

        input.close();
    }
}