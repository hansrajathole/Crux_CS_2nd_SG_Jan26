public class Selection_sort{
    public static void main(String[] args) {
        

        int arr [] = {5,2,4,3,1};
        Print(arr);
        System.out.println();
        Selection_sort(arr);
        Print(arr);

    }

    public static void Print(int arr []){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void Selection_sort(int arr []){
        for(int i = 0 ; i<arr.length-1 ;i++){
            int currentIdx = i;

            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[currentIdx]> arr[j]){
                    currentIdx = j;
                }
            }

            int temp = arr[i];
            arr[i] =  arr[currentIdx];
            arr[currentIdx] =  temp;
        }
    }
}