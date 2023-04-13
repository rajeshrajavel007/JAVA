public class SimpleEncodedArray {
    public static void main(String[] args) {
        int[] a = {7, 6, 8, 16, 12, 3};
        int n = 6, j = n-1;
        int[] arr = new int[n];

        arr[n-1] = a[n - 1];
      //  System.out.println(arr[5]);
        for (int i = n - 1; i >= 1; i--) {
            a[i - 1] = a[i - 1] - a[i];
            arr[j-1] = a[i - 1];
            j--;
        }
        for (int x = 0; x <=n-1; x++) {
            System.out.println(arr[x]);
        }
    }
}
