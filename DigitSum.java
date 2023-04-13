import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input= in.nextInt();
        int sum = 0, flag = 1;
        while (flag != 0) {
            while (input != 0) {
                sum += input % 10;
                input = input / 10;
            }
            input = sum;
            flag = sum;
            flag = flag / 10;
            sum = 0;
        }
        int output = input;
        System.out.println(output);
    }
}


