public class StrongNumber {
    public static void main(String []args){
        int num,fact=1,input=145,output=145,strong=0;
        while(input!=0){
            num = input%10;
            while(num!=0){
                fact *= num;
                num--;
            }
            strong+=fact;
            fact=1;
            input /=10;
        }
        if(output==strong) System.out.println("Strong Number");
        else System.out.println("Not Strong Number");
    }
}
