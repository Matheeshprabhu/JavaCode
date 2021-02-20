import java.util.Scanner;
public class LongWords{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str[] = new String[n];

        for(int i=0;i<n;i++){
            str[i]=sc.nextLine();
        }

        for(int i=0;i<n;i++){
            String input = str[i];
            int length = input.length();

            if(length>10){

                char c1 = input.charAt(0);
                char c2 = input.charAt(length-1);
                length = length-2;

                String s1 = String.valueOf(c1);
                String s2 = String.valueOf(c2);
                String s3 = String.valueOf(length);

                System.out.println(s1+s3+s2);
            }
            else{
                System.out.println(input);
            }
        }
    }
}