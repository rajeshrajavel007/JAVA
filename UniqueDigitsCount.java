import java.util.Scanner;

public class UniqueDigitsCount {
    public static void main(String[] args) {
        int count = 0, len = 0;
        System.out.println("Enter the number:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int num1 = num;
        while (num != 0) {
            num /= 10;
            ++len;
        }
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = num1 % 10;
            num1 /= 10;

        }
        int[] brr = new int[len];
        for (int i = 0; i < len; i++){
            brr[i] = arr[i];
    }
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i] == arr[j]){
                    brr[j]=0;
                    brr[i]=0;
                }
            }
        }
        for(int z=0;z<len;z++){
            if(brr[z] != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}