package Lec7;

public class Pattern19 {
    public static void main(String[] args) {
        int n= 7;
        int space = -1;
        int star = n/2+1;
        int row = 1;

        while (row<=n) {
            //Star
            int i = 1;
            while (i<=star) {
                System.out.print("* ");
                i++;
            }
            //Space
            int j = 1;
            while (j<=space) {
                System.out.print("  ");
                j++;
            }
            //Star

            int k = 1;
            if(row == 1 || row ==n){
                k = 2;
            }
            while (k<=star) {
                System.out.print("* ");
                k++;
            }

            // Next line prep
            if(row<n/2+1){
                space += 2;
                star--;
            }else {
                space -= 2;
                star++;
            }

            row++;
            System.out.println();
        }

    }
}
