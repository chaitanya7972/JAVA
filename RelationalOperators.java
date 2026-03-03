public class RelationalOperators {
    public static void main(String[] args) {
        
        // Basic Numeric Comparisons
        System.out.println(10 > 20);    // false
        System.out.println(10 < 20);    // true
        System.out.println(30 >= 20);   // true
        System.out.println(30 <= 20);   // false
        System.out.println(30 != 20);   // true
        System.out.println(20 == 20);   // true

        // Double and Float Comparisons
        System.out.println(10.0 > 20.0);  // false
        System.out.println(10.0 < 20.0);  // true
        System.out.println(30.0 <= 20.0); // false
        System.out.println(30.0 >= 20.0); // true
        System.out.println(30.0 != 20.0); // true
        System.out.println(30.0 == 20.0); // false

        // Character Comparisons (Based on ASCII/Unicode values)
        System.out.println(10 > 'A');     // false ('A' is 65)
        System.out.println('a' <= 20);    // false ('a' is 97)
        System.out.println(30.0 <= 'C');  // true  ('C' is 67)
        System.out.println('A' >= 'a');   // false (65 >= 97)
        System.out.println('C' != '@');   // true
        System.out.println('2' == 2);     // false (Char '2' is ASCII 50, not value 2)

        // Boolean Comparisons (Only == and != are allowed)
        System.out.println(true != false); // true
        System.out.println(true == true);  // true

        // String Comparisons (Only == and != are allowed for references)
        System.out.println("hello" == "hello"); // true
        System.out.println("hello" != "hello"); // false
        
        // Mixed String and Number (Equality check)
        // System.out.println("20.0" != 20.0); // This would be a CTE in Java. 
        // Strings cannot be compared to primitives using relational operators.
    }
}