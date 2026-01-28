public class Pattern26 {
    public static void main(String[] args) {
        int n =5;
        int space = n-1;
        int digit = 1;
        int row = 1;

        while (row<=n) {
            //Space
            int i =1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }

            // Digit
            int j = 1;
            int val = 1;
            while (j<=digit) {
                System.out.print(val+" ");
                j++;
                val++;
            }

            // Next line
            space--;
            digit += 2;
            row++;
            System.out.println();
            
        }
    }
}