import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int pincode = 4106;
        int count = 0;
        do{
            count++;
            System.out.print("Enter the Pin Code: ");
            int userInput = input.nextInt();
            if(pincode==userInput){
                break;
            }else{
                System.out.println("Wrong!!!!");
                System.out.print("Try Again!! ");
            }
        } while(count<3);
        if (count==3) {
            System.out.println("Better Luck Next Time");
            return;
        }
        System.out.println("Welcome To My ATM");
        input.close();
    }
}
