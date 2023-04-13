import java.util.Scanner;
public class FindStringCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str = str1.toLowerCase();
        String[] sarr = str.split(" ");
        int first,last,diff,len,till,sum=0;
        String code="";
        for (String s : sarr) {
            len = s.length();
            till = len / 2;
            if (len % 2 == 0) till--;
            for (int pos = 0; pos <= till; pos++) {
                first = s.charAt(pos) - 96;
                if (pos != len - pos - 1) {
                    last = s.charAt((len - pos - 1)) - 96;
                    diff = first - last;
                    if (diff < 0) diff = (diff * -2) + diff;
                } else diff = first;
                sum += diff;
            }
            code += sum;
            sum = 0;
        }
        System.out.println(Integer.parseInt(code));
    }
}

