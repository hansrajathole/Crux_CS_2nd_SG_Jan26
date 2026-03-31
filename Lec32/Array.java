package Lec32;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        
        // int arr[][] = new int[3][4];

        // System.out.println(arr);
        // System.out.println(arr[0]);
        // System.out.println(arr[0][1]);

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        for(int i = 0 ; i<row ; i++){
            for(int j = 0 ; j<col ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        Display(arr, row, col);


    }

     public static void  Display(int arr[][],int row , int col){
         for(int i = 0 ; i<row ; i++){
            for(int j = 0 ; j<col ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
