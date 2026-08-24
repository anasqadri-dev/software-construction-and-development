import java.util.Scanner;
public class task06 {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value to find its index(0-9): ");
        int value = input.nextInt();
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==value){
                index=i;
            }
        }
        if(index==-1){
            System.out.println("The Entered Value Does Not Exists....");
        }else{
            System.out.println("The index of " + value + " is: " + index);
        }
        input.close();
    }
}