import java.util.Scanner;

public class SecondDigit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num<0){
            num = num*-1;
        }
        if(num<10){
            System.out.println("-1");
        }
        else{
            int num1 = (num/10)%10;
            System.out.println(num1);
        }
    }
}
