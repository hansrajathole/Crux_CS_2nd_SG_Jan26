package Lec7;

public class Pattern20 {
    public static void main(String[] args) {
        int n = 7;
        int space = n/2;
        int star = 1;
        int row = 1;


        while (row<=n) {
            //Space
            int i = 1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }
            //Star
            int j = 1;
            while (j<=star) {
                if(j == 1 || j == star){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }

                j++;
            }

            // Next line prep

            if(row<n/2+1){
                star += 2;
                space--;
            }else {
                star -= 2;
                space++; 
            }

            row++;
            System.out.println();
        }
    }
}
