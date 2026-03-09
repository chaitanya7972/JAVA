public class CompareNumbers {
    public static void main(String[] args) {
        int a = 1;
        int b = -1;

        // Check if b (-1) is smaller than a (1)
        if (b < a) {
            System.out.println(b + " is the smallest.");
            System.out.println(a + " is the largest.");
        } 
        else if (b > a) {
            System.out.println(b + " is the largest.");
        } 
        else {
            System.out.println("Both are equal.");
        }
    }
}