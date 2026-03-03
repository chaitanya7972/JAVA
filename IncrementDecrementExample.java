public class IncrementDecrementExample1 {
    public static void main(String[] args) {

        // --- SECTION 1: Handwritten Example 1 (Top of image) ---
        int a = 6;
        int b = 7;
        // Postfix increment: c gets current value (6), then a becomes 7
        int c = a++; 
        // Logic: -7 (pre-dec b) + 7 (post-inc a) - 6 (val of c) + 8 (pre-inc b)
        // Values used: -6 + 7 - 6 + 8 = 3 (Note: Note logic varies by compiler; let's use Java standard)
        int d = --b + a++ - c + ++b; 

        System.out.println("--- Ex 1 Results ---");
        // System.out.println(a++ - --a + ++a - a-- + c++);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);

        // --- SECTION 2: Example 2 (Bottom of image) ---
        int x = 10;
        int y = 20;
        x++;        // x becomes 11
        --x;        // x becomes 10
        x = x + y;  // x = 10 + 20 = 30
        x += y;     // x = 30 + 20 = 50
        y++;        // y becomes 21

        x = y + ++y; // x = 21 + 22 = 43
        y += x--;    // y = 21 + 43 = 64 (x then becomes 42)

        System.out.println("\n--- Ex 2 Results ---");
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        // --- SECTION 3: Character & String Arithmetic ---
        System.out.println("\n--- Char & String Arithmetic ---");
        char ch = 'A';  // 65
        char ch1 = 'a'; // 97

        // ch++(65) + ++ch1(98) - --ch1(97) - ++ch1(98) + ++ch(67)
        System.out.println(ch++ + ++ch1 - --ch1 - ++ch1 + ++ch); 

        int i = 10;
        int j = 11;
        double db = 20.0;
        char c1 = 'A';

        // Fix: Math wrapped in () to avoid String subtraction error
        System.out.println(i++ + "hello" + (j++ + db + ++c1)); 
        
        // Fix: Boolean must be converted to String using "" + to avoid CTE
        System.out.println(true + "" + c1++ + ++db); 
    }
}