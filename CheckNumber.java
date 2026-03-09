public class CheckNumber {
    public static void main(String[] args) {
        // 1. Define the number
        int num = -15; 

        // 2. Check the condition
        if (num > 0) {
            // This runs if num is greater than 0
            System.out.println(num + " is a Positive number.");
        } 
        else if (num < 0) {
            // This runs if num is less than 0
            System.out.println(num + " is a Negative number.");
        } 
        else {
            // This runs if num is exactly 0
            System.out.println("The number is Zero.");
        }
    }
}