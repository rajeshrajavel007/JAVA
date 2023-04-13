import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num<0){
            num = num*-1;
        }
        num = num%10;
        System.out.println(num);
    }
}
