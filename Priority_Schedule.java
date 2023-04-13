import java.util.Scanner;
public class Priority_Schedule {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();//last from array
        int[] arr = new int[n];
        int[] brr = new int[10];
        for(int i =0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int pos=n-k;
        for(int i=0;i<k;i++){
            brr[i]=arr[pos];
            pos++;
        }
        int	i=0;
        for(int j=k;j<pos;j++){
            brr[j]=arr[i];
            i++;
        }
        for(int x=0;x<n;x++){
            System.out.print(brr[x]+" ");
        }
    }
}
