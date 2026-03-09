public class CheckUpper {
    public static void main(String[] args) {
        // 1. Pick a character to test
        char ch = 'G'; 

        // 2. Check: Is 'ch' between 'A' and 'Z'?
        if (ch >= 'A' && ch <= 'Z') {
            // This runs if the condition is TRUE
            System.out.println(ch + " is Upper Case!");
        } 
        else {
            // This runs if the condition is FALSE
            System.out.println(ch + " is not Upper Case.");
        }
    }
}