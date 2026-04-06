package Lec36;

public class String_Demo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hillo");
        
        str1 =  str1.concat(str4); // ----> "Hellohello"
        System.out.println(str1);
        System.out.println(str2);



        // System.out.println(str1 == str2); // compare address  ----> T
        // System.out.println(str3 == str4); // compare address  ----> F
        // System.out.println(str3 == str2); // compare address  ----> F
        // int arr [] =  new int[5];
     
        // System.out.println(arr.length);
        // System.out.println(str1.length());

        // System.out.println(str1.equals(str2));
        // System.out.println(str3.equals(str4));
        // System.out.println(equals(str1, str2));
        // System.out.println(equals(str3, str4));

        // System.out.println(str1.equals(str2));
        // System.out.println(str1.compareTo(str4)); // ---> +ve    , -ve    , 0
        // System.out.println(compareTo(str1, str4));
    }

    public static boolean equals(String str1 , String str2){

        if(str1.length() != str2.length()){
            return false;
        }

        for(int i = 0 ; i<str1.length() ; i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }

        return true;

    }

     public static int compareTo(String str1 , String str2){
        if(str1 == str2){
            return 0;
        }

        int n = Math.min(str1.length(), str2.length());
        for(int i = 0 ; i<n ; i++){
            if(str1.charAt(i) !=  str2.charAt(i)){
                return str1.charAt(i)-str2.charAt(i);
            }
        }

        return str1.length()- str2.length();
     }

}
