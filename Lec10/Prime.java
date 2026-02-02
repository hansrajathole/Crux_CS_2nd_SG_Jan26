public class Prime {
    public static void main(String[] args) {
            int n = 11;
            int count = 0;

            for(int i = 2; i<=n-1;i++){
                if(n%i == 0){
                    count++;
                    break;
                }
            }

            if(count == 0){
                System.out.println("Prime number");
            }else {
                System.out.println("not Prime");
            }

    }
}