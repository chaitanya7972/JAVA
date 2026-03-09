//import statement
import java.util.Scanner;
public class Programm1 {
    public static void main (String[] args){
        System.out.println();
        //object
        //object creation
        Scanner sc = new Scanner (System.in);
        
        //calling Non-static method
        System.out.println ("Enter your name");
        String name = sc.next ();
        System.out.println ("Name is" + name);
        
        System.out.println ("Enter your age");
        int age = sc.nextInt();
        System.out.println ("Age is" + age);
        
        System.out.println ("Enter your gender");
        char gender = sc.next().charAt(0);
        System.out.println ("Gender is" + gender);
        
        System.out.println ("Enter your marks");
        double marks = sc.nextDouble();
        System.out.println ("Marks are" + marks);
        
        System.out.println ("Enter your result status");
        boolean resultStatus = sc.nextBoolean();
        System.out.println ("Result status is" + resultStatus);
    }
}