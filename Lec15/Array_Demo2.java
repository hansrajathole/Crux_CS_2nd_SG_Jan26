public class Array_Demo2 {
    public static void main(String[] args) {
        

        int[] arr = {10,20,30,40,50};
        Swap(arr[0], arr[1]);

        System.out.println(arr[0]+ " "+arr[1]);
    }

    public static void Swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
