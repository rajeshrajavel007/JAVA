public class PalindromeInString {
    public static void main(String[] args) {
        String str = "malayalam";
        int flag = 0;
        int len = str.length();
        int count = (len / 2) - 1;
        int mid = len/2;
        int last = len-1;
        for (int first = 0; first <= count; first++) {
            if (str.charAt(first) == str.charAt(last-first)) {
                flag++;
            }

        }
        if (mid == flag) System.out.println("palindrome");
        else System.out.println("Not a palindrome");

    }
}
