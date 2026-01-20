package Lec3;

public class Grade {
    public static void main(String[] args) {

        int mark = 33;

        if(mark >= 80 && mark <= 99){
            System.out.println("Grade A");
        }else if(mark >=70 && mark <80){
            System.out.println("Grade B");
        }else if(mark >= 60 && mark < 70){
            System.out.println("Grade c");
        }else if(mark >=45 && mark < 60){
            System.out.println("pass");
        }else {
            System.out.println("Fail");
        }
    }
}
