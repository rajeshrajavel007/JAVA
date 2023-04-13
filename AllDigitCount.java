import java.util.Scanner;
public class AllDigitCount {
    public static void main(String args[]) {
        int count=0;
        System.out.println("Enter the number:");
        Scanner in = new Scanner(System.in);
        int  input = in.nextInt();
        while(input!=0){
            input /= 10;
            ++count;
        }
        System.out.println(count);
    }
}

