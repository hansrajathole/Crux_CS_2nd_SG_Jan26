public class Rotate_Array {
    public static void main(String[] args) {
        
        int arr [] = {1,2,3,4,5};
        Rotate(arr);
        Print(arr);

    }
    public static void Print(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void Rotate(int arr[]){
        int n = arr.length;
        int key = arr[n-1];

        int i = n-1;
        while (i>0) {
            arr[i] = arr[i-1];
            i--;
        }
        arr[i]= key;
    }
}