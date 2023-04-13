import java.util.Scanner;
public class NonPrimeIndexValue {
    public static void main(String[] args) {
        boolean fact = true;
        System.out.println("Enter a number:");
        Scanner in = new Scanner(System.in);
        int  input = in.nextInt();
        for(int i=2;i<input;i++){
            if(input%i==0){
                fact=true;
                break;
            }
            else fact=false;
        }
        if(fact) System.out.println("Not a prime");
        else System.out.println("Prime");
    }
}