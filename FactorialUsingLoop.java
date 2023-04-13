import java.util.Scanner;

public class FactorialUsingLoop {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner in = new Scanner(System.in);
        int  input = in.nextInt();
        int fact=input;
        for(int i=2;i<input;i++){
            fact += (input-i)*fact;
        }
        System.out.println(fact);
    }
}

