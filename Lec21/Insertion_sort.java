public class Insertion_sort {
    public static void main(String[] args) {
        
        int arr [] = {5,2,4,3,1};
        Print(arr);
        System.out.println();
        Insertion_sort(arr);
        Print(arr);
       
    }

     public static void Print(int arr []){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void Insertion_sort(int arr []){
        for(int i = 1 ; i<arr.length ;i++){
            int key = arr[i];
            int j = i-1;


            while (j>=0 && arr[j] > key) {
                arr[j+1] =  arr[j];
                j--;
            }

            arr[j+1] =  key;
        }
    }
}
