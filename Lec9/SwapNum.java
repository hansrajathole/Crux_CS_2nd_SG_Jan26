public class SwapNum {
    public static void main(String[] args) {
        
        int a = 15;
        int b = 20;

        b = (a+b) - (a=b);
        System.out.println(a);
        System.out.println(b);
    }
}
