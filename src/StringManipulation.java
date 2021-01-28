public class StringManipulation {

    public static void main(String args[]){

        String str = "is This a string";

        //System.out.println("\\n");

        str = str.replaceFirst("This ","This&");

        str = str.replace(" ", "");

        str = str.replace("&", " ");

        //str = str.replaceAll("\\s","");

       // System.out.println(thisPos);
        for(int i=0; i<str.length(); i++){

            System.out.println(str.charAt(i));
        }


    }
}