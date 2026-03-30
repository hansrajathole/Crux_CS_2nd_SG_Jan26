package Lec31;

public class Time_complexity {
    public static void main(String[] args) {
        

           int low = 0;
        int high = arr.length-1;

        while (low<= high) {
            int mid = (low+high)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]> target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

       return -1;


        int i = 1;
        int n = 1000_000;
       	while (i <= n) {
			System.out.println("Hey");
			
			i += 2;
			i += 3;
		}


        while (n > 0) {
			System.out.println("Hey");
			
			n /= 2;
			n /= 3;
		}

        int k = 2;
		while (i <= n) {
			System.out.println("Hey");
	
			i += k;
		}


        while (i <= n) {
			System.out.println("Hey");
           // O(log n)
			i *= k;
		}

        for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (k = 1; k <= n / 2; k++) {
				
					System.out.println("hey");
				}
			}
		}


        for (i = n / 2; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				for ( k = 1; k <= n; k = k * 2) {
					System.out.println("hey");
				
				}
			}
		}


        for (i = 1; i * i <= n; i++) {
           // O(sqrt N)
			System.out.println("hey");
		}


           for (i = n / 2; i <= n; i++) {
			for (int j = 1; j <= n; j * 2) {
				for ( k = 1; k <= n; k = k * 2) {
					System.out.println("hey");
				
				}
			}
		}

    }
}
