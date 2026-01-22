public class Pattern8{
    public static void main(String[] args) {
        

        int n = 5;
        int star = n ;
        int row = 1;

        while (row<=n) {
            
            // star
            int i = 1;
            while (i<=star) {
                if(row == i || row+i-1 == n){
                    System.out.print("* ");

                }else{
                    System.out.print("  ");
                }

                i++;
            }



            // Next line prep

            row++;
            System.out.println();


        }
    }
}