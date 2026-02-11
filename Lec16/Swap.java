public  class Swap {
    public static void main(String [] args){
        int[] arr = {10,20,30,40,50};
        int[] other = {1,2,3,4,5};

        Swap(arr, other);

        System.out.println(arr[0]+"  "+arr[1]);

    }

    public static void Swap(int[] arr , int [] other ){
        int[] temp = arr;
        arr = other;
        other = temp;
    }
}