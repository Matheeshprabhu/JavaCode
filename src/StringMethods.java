public class StringMethods {

    public static void main(String args[]){

//       int num = 1234353272;
//       int temp;
//       int arr[] = new int[10];
//       int i = 0;
//
//       while(!(num==0)){
//
//           temp = num%10;
//           System.out.print(temp);
//           arr[i]= temp;
//           num = num/10;
//           i++;
//
//       }
//        System.out.println();
//       for(int j=arr.length-1; j>=0 ;j--){
//           System.out.print(arr[j]);
//       }

        int num = 1234353272;

        String str = String.valueOf(num);

        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }





    }
}
