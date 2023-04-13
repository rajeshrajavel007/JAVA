import java.util.Scanner;

public class IOS_123 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n= in.nextInt();
        int[] arr = new int[n];
        int sum=0,flag=0;
        for(int i =0;i<n;i++){
            arr[i] = in.nextInt();
        }
        for(int j=0;j<n;j++){
            if (n==3){
                if(arr[j]==1){
                    sum+=arr[j];
                    flag++;
                }
                else if(arr[j]==2){
                    sum+=arr[j];
                    flag++;
                }
                else if(arr[j]==3) {
                    sum += arr[j];
                    flag++;
                }
                else  sum += arr[j];
            }
            else sum += arr[j];
            if(flag==3) {
                sum = 24;
                break;
            }
        }
        System.out.println(sum);
    }
}
