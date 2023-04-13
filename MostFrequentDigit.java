import java.util.Scanner;

public class MostFrequentDigit {
    public static int MFD(int input1,int input2,int input3,int input4){
        int[] arr = {input1, input2, input3, input4};
        int[] brr = new int[20];
        int count = 0, repeat = 0, temp;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != 0) {
                temp = arr[i] % 10;
                brr[count] = temp;
                count++;
                arr[i] /= 10;
            }
        }
        int[] crr = new int[count];
        for (int x = 0; x < count; x++) {
            for (int y = 0; y < count; y++) {
                if (brr[x] == brr[y]) {
                    repeat++;
                    crr[brr[x]] = repeat;
                }
            }
            repeat = 0;
        }
        int max = 0, mfd = 0;
        for (int z = 0; z < count; z++) {
            if (crr[z] >= max) {
                max = crr[z];
                mfd = z;
            }
        }
        return mfd;
    }
    public static void main(String[] args) {
        int i1,i2,i3,i4;
        Scanner in = new Scanner(System.in);
        i1= in.nextInt();
        i2= in.nextInt();
        i3= in.nextInt();
        i4= in.nextInt();
        System.out.println(MFD(i1,i2,i3,i4));
    }
}
