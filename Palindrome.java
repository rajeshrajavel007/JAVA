import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        int num, count = 0;
        while (input != 0) {
            num = input % 10;
            arr[count] = num;
            count++;
            input /= 10;
        }
        count--;
        int last = count;
        int flag = 0, mid = 99;
        if ((count % 2) == 0)   mid = count / 2;
        for(int first=0;first<=count/2;first++){
            if(mid==first)  continue;
            else if(arr[first]==arr[last])  flag =1;
            else flag=0;
            last--;
        }
        if(flag==1) System.out.println("2");
        else System.out.println("1");
    }
}
