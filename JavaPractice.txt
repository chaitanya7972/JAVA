public class JavaPractice {
    public static void main(String[] args) {
        
        // --- SECTION 1 ---
        char ch = 'A';  // ASCII 65
        char ch1 = 'a'; // ASCII 97

        // Note: Mathematical operations on chars convert them to int (ASCII values)
        System.out.println(ch++ + ++ch1 - --ch1 - ++ch1 + ++ch); 
        // Logic: 65 (uses 65, ch becomes 66) + 98 (ch1 becomes 98) - 97 (ch1 becomes 97) - 98 (ch1 becomes 98) + 67 (ch becomes 67)
        
        System.out.println(ch);  // Prints 'C' (ASCII 67)
        System.out.println(ch1); // Prints 'b' (ASCII 98)

        // --- SECTION 2 ---
        int i = 10;
        int j = 11;
        double d = 20.0;
        char c1 = 'A';

        // 1. String Concatenation Rule: Once a String is encountered, 
        // '+' usually treats following elements as Strings. 
        // Note: Subtraction (-) is NOT allowed with Strings.
        System.out.println(i++ + "hello" + (j++ - -d + ++c1)); 
        // Fixed: Subtraction logic must be grouped in () to avoid Compile Time Error (CTE)

        // 2. Boolean Logic
        // Note: You cannot use '+' with a boolean and a String directly in some contexts, 
        // but "hello" + true is valid String concatenation.
        System.out.println("hello" + j-- + true);

        // 3. Mixed Types
        System.out.println("hello" + c1++ + i++ + ++d);

        // 4. Mathematical Expressions (No Strings)
        System.out.println(i++ - c1++ - ++d);

        // 5. Another Math Expression
        System.out.println(i++ - c1++ - ++d);

        // 6. Boolean Addition
        // ERROR FIX: In Java, you CANNOT add a boolean to a char or double. 
        // This will result in a Compile Time Error (CTE). I have commented it out.
        // System.out.println(true + c1++ + ++d); // This would be a CTE
        System.out.println("Result: " + true + " " + c1++ + " " + ++d); // Valid way to print
    }
}