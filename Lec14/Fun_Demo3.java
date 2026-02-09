public class Fun_Demo3 {
    public static void main(String[] args) {
        int a = 45;
        int b = 33;
        Sub(b ,a);

    }

    public static void Sub(int a, int b){

        int c = b-a;
        Add(b, c);
        System.out.println(a-b);
    }


    public static void Add(int x , int y){
        System.out.println(x+y);
    }

}
