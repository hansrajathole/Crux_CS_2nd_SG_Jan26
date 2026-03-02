public class SubArray {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        int maxSum = Integer.MIN_VALUE;
        for(int start = 0 ; start< arr.length ; start++){
            int currentSum = 0;
            for(int end = start ; end< arr.length ; end++){
                currentSum += arr[end];

                maxSum = Math.max(currentSum, maxSum);
            }
        }

        System.out.println("Max Sum of sub array : "+maxSum);
    }
}