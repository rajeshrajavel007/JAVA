public class SecondWordInUppercase {
    public static void main(String[] args) {
        String str = "wipro Technology";

        String[] sarr = str.split(" ");
        if(sarr.length>=2){
            System.out.println(sarr[1].toUpperCase());
        }
        else{
            System.out.println("LESS");
        }
    }
}
