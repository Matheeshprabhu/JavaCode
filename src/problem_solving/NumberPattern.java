package problem_solving;
import java.util.Scanner;

public class NumberPattern
{
    public  static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        printPat(t);
    }

    public static void printPat(int n)
    {
        for(int i=n;i>0;i--){
            for(int j=n;j>0;j--){
                for(int k=0;k<i;k++)
                    System.out.print(j+" ");
            }
            System.out.print("$");
        }
    }
}



//    You are given a number N. You need to print the pattern for the given value of N.
//        for N = 2 the pattern will be
//        2 2 1 1
//        2 1
//        for N = 3 the pattern will be
//        3 3 3 2 2 2 1 1 1
//        3 3 2 2 1 1
//        3 2 1
//
//        Example 1:
//
//        Input: 2
//        Output:
//        2 2 1 1 $2 1 $
//
//        Example 2:
//
//        Input: 3
//        Output:
//        3 3 3 2 2 2 1 1 1 $3 3 2 2 1 1 $3 2 1 $
//
//
//        Your Task:
//        Since this is a function problem, you don't need to worry about the testcases. Your task is to complete the function printPat which takes one argument 'N' denoting the length of the pattern.
//        Note : Instead of printing new line print a "$" without quotes.