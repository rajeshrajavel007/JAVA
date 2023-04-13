import java.util.Scanner;
public class NthFibonacci {
    public static void main(String[] args) {
        int a=0,b=1,c=0;
        System.out.println("Enter the Nth number:");
        Scanner in = new Scanner(System.in);
        int  input = in.nextInt();
        if(input==1) c= 0;
        else if(input==2) c= 1;
        else{
            for(int i=2;i<input;i++){
                c = a+b;
                a=b;
                b=c;
            }
        }
        System.out.println(c);
    }
}
