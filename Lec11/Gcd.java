package Lec11;

public class Gcd {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 12;

        int gcd = 1;
       

        int small = num1<num2 ? num1 : num2;

        for(int i = 1 ; i<=small ; i++){
            if(num1 %i == 0 && num2 % i == 0){
                gcd = i;
            }
        }

        System.out.println(gcd);

    }
}
