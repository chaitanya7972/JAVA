//Write a Java program to check if a number entered by the user is positive, negative, or zero.


class Numbercheck {
    public static void main(String[] args) {
        
        // Just like setting smith_wallet, we set our number here
        int number = -15; 

        if (number > 0) {
            System.out.println("The number is POSITIVE");
        } 
        else if (number < 0) {
            System.out.println("The number is NEGATIVE");
        } 
        else {
            // If it's not greater than 0 and not less than 0, it must be 0
            System.out.println("The number is ZERO");
        }
        
    }
}