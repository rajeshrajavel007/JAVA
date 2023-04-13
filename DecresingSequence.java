public class DecresingSequence {
    public static void main(String[] args) {
        int arr[] =  {11,3,1,4,7,8,12,2,3,7};
        int[] brr = new int [10];
        int n=10,seq_count=0,len=0,max_len=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                brr[i] = arr[i];
                brr[i+1]=arr[i+1];
            }
        }
        for(int j=0;j<10;j++){
            if(brr[j]!=0){
                if(len==0) seq_count++;
                len++;
                if(max_len<len) max_len=len;
            }
            else len=0;
        }
        System.out.println(seq_count+" "+max_len);
    }
}
