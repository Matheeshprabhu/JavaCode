import java.util.Scanner;

public class MyClass {
    public static void main(String args[]){
        int lastTemp=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        int temp1=0;
        int temp=0;

        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        temp=0;
        for(int i=0;i<n;i++){
            if(temp>temp1){
                temp1=temp;
            }
            temp=a[i]+temp;
            if(a[i]<lastTemp){
                temp=a[i];
            }
            lastTemp=a[i];
        }

        System.out.println(temp1);
    }
}
