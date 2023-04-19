public class Number_Pyramid {
    public static void main(String[] args) {
        int i,j,print=1,num=3;
        for(i=1;i<=num;i++){
            for(j=1;j<=i*2;j++){
                System.out.print(print+"");
            }
            System.out.println();
        }
    }
}
