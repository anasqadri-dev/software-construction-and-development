public class task05 {
    public static void main(String[] args) {
        char[] symbols = {'!','@','#','$','%'};
        for (int i = (symbols.length-1); i >= 0 ; i--) {
            System.out.println("Symbol No: " + (i+1) + " is: " + symbols[i]);
        }
    }
}
