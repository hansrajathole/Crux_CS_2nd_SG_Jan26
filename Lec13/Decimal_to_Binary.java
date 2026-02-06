
public class Decimal_to_Binary{
    public static void main(String[] args) {
        

        int n = 378;

        int binary = 0;
        int power = 1;
        while (n>0) {
            int rem = n%2;
            binary = binary+rem*power;
            n = n/2;
            power = power*10;

        }

        System.out.println(binary);
    }
}