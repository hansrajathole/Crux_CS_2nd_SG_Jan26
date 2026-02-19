public class Rotate_Array_by_k_times {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 3;
        int n = arr.length;
        k = k%n;
        Print(arr);
        System.out.println();
        Rotate(arr, k , n);
        Print(arr);
        System.out.println();
        Rotate(arr, k+1 , n);
        Print(arr);

    }

    public static void Print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Rotate(int arr[], int k, int n) {
        for (int j = 0; j < k; j++) {
           
            int key = arr[n - 1];

            int i = n - 1;
            while (i > 0) {
                arr[i] = arr[i - 1];
                i--;
            }
            arr[i] = key;
        }
    }

}
