
import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // int n ;
        // String fName ;

        // fName = input.next();
        // // n = input.nextByte();
        // // System.out.println("your entered value is : "+n);

        // System.out.println(fName);


        int age;
        String name;
        char fav;

        System.out.print("enter your name :");
        name = input.nextLine();
        System.out.print("enter your age :");
        age = input.nextInt();
        System.out.print("enter your fav char :");
        fav = input.next().charAt(0);

        System.out.println("your name is : "+name +" your age : "+age +" and your fav char : "+fav  );
    }
}