import java.util.*;
public class DigitSumOption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input= in.nextInt();
        String str = in.next();
        int num,evensum=0,oddsum=0;
        while(input!=0){
            num = input%10;
            if(num%2==0) {
                evensum += num;
                //System.out.println(evensum);
            }
            else{
                oddsum += num;
               // System.out.println(oddsum);
            }
            input /= 10;
        }
        if(str.equals("even")) {
            System.out.println(evensum);
        }
        if(str.equals("odd")) {
            System.out.println(oddsum);
        }
    }
}
