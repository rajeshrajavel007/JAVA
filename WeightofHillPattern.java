public class WeightofHillPattern {
        public static void main(String[] args) {
            int rows = 5;
            int row_value = 10;
            int row_inc = 2;
            int row_sum =0;
            int total_sum  =0;
            for(int i= 1;i<rows+1;i++){
                for(int j= 1;j<i+1;j++){
                    row_sum = row_value * i;
                    System.out.print("*  ");
                }
                total_sum += row_sum;
                row_value += 2;
                System.out.println("\n");
            }
            System.out.println(total_sum);
        }
    }

