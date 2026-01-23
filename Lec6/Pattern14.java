package Lec6;

public class Pattern14 {
    public static void main(String[] args) {
        
        int n = 5;
        int star = 1;
        int row = 1;
        int space = n-1;

        while (row<=n*2-1) {

            //Space 
             int i = 1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }

            //Star
            int col = 1;
            while (col<=star) {
                System.out.print("* ");
                col++;
            }
            //Next line prep
            if(row<n){
                space--;
                star++;
            }else{
                star--;
                space++;
            }

            row++;
            System.out.println();


        }
    }
}
