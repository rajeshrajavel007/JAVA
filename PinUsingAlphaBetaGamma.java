public class PinUsingAlphaBetaGamma {
    public static void main(String[] args) {
        int[] arr = {111,222,333};
        int[] brr = new int[4];
        int num,min=99,max=0,j=0,k=0,pin=0;
        while(arr[j]!=0){
            for(int i=0;i<arr.length;i++) {
                num = arr[i]%10;
                if(num<min) {
                    min =num;
                }
                if(num>max){
                    max=num;
                }
                arr[i] /= 10;
            }
            brr[k] = min;
            min=99;
            k++;
        }
        brr[k] = max;
        for(int i=brr.length-1;i>=0;i--) {
            pin = pin*10+brr[i];
        }
        System.out.println(pin);
    }
}