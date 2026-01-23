package Lec6;

public class Pattern13 {
    public static void main(String[] args) {
        
        int n = 5;
        int star = 1;
        int row = 1;

        while (row<=n*2-1) {
            //Star
            int col = 1;
            while (col<=star) {
                System.out.print("* ");
                col++;
            }
            //Next line prep
            if(row<n){
                star++;
            }else{
                star--;
            }

            row++;
            System.out.println();


        }
    }
}
