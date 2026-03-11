public class Trapping{
    public static void main(String [] args){
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};

        int left [] =  new int[arr.length];
        left[0] = arr[0];
        for(int i = 1 ; i< arr.length ; i++){
            left[i] = Math.max(left[i-1], arr[i]);
        }

        int right[] = new int[arr.length];
        right[arr.length-1] = arr[arr.length-1];
        for(int j = arr.length-2 ; j>=0 ; j--){
            right[j] = Math.max(right[j+1],arr[j]);
        }


        int water = 0;
        for(int k = 0 ; k<arr.length; k++){
            water += Math.min(left[k],right[k])- arr[k];
        }

        System.out.println(water);

    }
}