package Lec17;

public class Max_Array {
    public static void main(String[] args) {
        int []arr = {14,5,3,2,7,8};

        System.out.println(Max(arr));

    }

    public static int Max(int[] arr){
        int max = arr[0];

        for(int i = 1; i<arr.length ; i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }

        return max;
    }
}
