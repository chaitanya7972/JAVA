public class CheckLower {
    public static void main(String[] args) {
        // 1. Pick a character to test
        char ch = 'g'; 

        // 2. Check: Is 'ch' between 'a' and 'z'?
        if (ch >= 'a' && ch <= 'z') {
            // This runs if 'ch' is lowercase
            System.out.println(ch + " is Lower Case!");
        } 
        else {
            // This runs if 'ch' is uppercase or something else (like a number)
            System.out.println(ch + " is not Lower Case.");
        }
    }
}