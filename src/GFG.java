//import java.util.Scanner;
//public class GFG {
//    public static void main(String args[]){
//
//       // Scanner sc=new Scanner(System.in);
//        Compute obj;
//        obj= new Compute();
//
//        long temp[]={22,11,1,33,66,55,12,64,432,9992,222202};
//
//         long output[]=obj.findElements(temp,11);
//
//         for(long p:output){
//             System.out.print(p+" ");
//         }
//    }
//}
// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
    public static void main(String[] args) throws IOException
    {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int t = Integer.parseInt(br.readLine().trim());

            int n = 5;
            long[] a = {22,11,13,9,7};

            Compute obj = new Compute();
            long answer[] = obj.findElements( a, n);
            long sz = answer.length;

            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);


    }
}


class Compute {
    public long[] findElements( long a[], long n)
    {
        long temp = 0;
        int manoj = (int)n;

        long[] dharma = new long[manoj-2];

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<manoj-2;i++){
            dharma[i] = a[i];
        }

        return dharma;
    }
}