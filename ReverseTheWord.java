public class ReverseTheWord {
    public static void main(String[] args) {
            String str="nothing breaks like heart";
            String[] words=str.split(" ");
            String revstr="";
            for(String w:words)
            {
                String revwrd= "";
                for(int i=w.length()-1;i>=0;i--)
                {
                    revwrd= revwrd + w.charAt(i);

                }
                revstr= revstr + revwrd + " ";
            }
        System.out.println(revstr);
    }

}
