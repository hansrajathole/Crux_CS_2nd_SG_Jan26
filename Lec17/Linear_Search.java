package Lec17;

public class Linear_Search {
    public static void main(String[] args) {
        
        int [] arr = {1,2,4,3,5,8,6};
        int target = 8;

        int ans = Search(arr, target);
        System.out.println(ans);

    }
    public static int Search(int[] arr ,int target){
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}
