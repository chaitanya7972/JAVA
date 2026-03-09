public class FindLargest {
    public static void main(String[] args) {
        // 1. Define two numbers
        int a = 25;
        int b = 42;

        // 2. Compare using if-else
        if (a > b) {
            System.out.println(a + " is the largest number.");
        } 
        else if (b > a) {
            System.out.println(b + " is the largest number.");
        } 
        else {
            System.out.println("Both numbers are equal.");
        }
    }
}