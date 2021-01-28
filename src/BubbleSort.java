import java.util.Scanner;

public class BubbleSort {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in); // user's input
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int temp = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for(int num : a){
            System.out.print(num+" ");
        }




    }
}
