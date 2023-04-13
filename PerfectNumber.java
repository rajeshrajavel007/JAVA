public class PerfectNumber {
    public static void main(String []args){
        int input=28,sum=0;
        for(int i=1;i<input;i++){
            if(input%i == 0){
                sum += i;
            }
        }
        if(input==sum) System.out.println("Perfect Number");
        else System.out.println("Not Perfect Number");
    }
}
