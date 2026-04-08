import java.util.Arrays;

public class Reverse_Words{
    public static void main(String[] args) {
        String str = "    hello   world   ";
        System.out.println(str);
        str = str.trim();
        System.out.println(str);
        String arr[] =  str.split(" +");
        // System.out.println(Arrays.toString(arr));


        String s = "";
        for(int i = arr.length-1 ; i>= 0 ; i--){
           s += arr[i]+" ";
        }

        System.out.println(s);
    }
}