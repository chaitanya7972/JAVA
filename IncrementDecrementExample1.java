public class IncrementDecrementExample1 {
	
public static void main(String[] args) {
        
        // --- SECTION 1:  Logic (Ex 1) ---
        int a = 6;
        int b = 7;
        int c = a++; // c=6, a becomes 7

        // Corrected syntax: Java doesn't allow "-- -b". 
        // Logic: (6) + (7) - (6) + (7)
        int d = --b + a++ - c + b++;

        // System.out.println expressions from your notes
        System.out.println("Result 1: " + (a++ - --a + ++a - a-- + c++));
        System.out.println("Result 2: " + (b++ - c + a++ - d++));

        System.out.println("a: " + a); // Final values after expressions
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);

        // --- SECTION 2:  Logic (Ex 1) ---
        int x = 10;
        int y = 20;
        x++;        // x=11
        --x;        // x=10
        
        x = x + y;  // x=30
        x += y;     // x=50
        y++;        // y=21

        x = y + ++y; // x = 21 + 22 = 43
        y += x--;    // y = 21 + 43 = 64, then x becomes 42

        System.out.println("\n - x: " + x);
        System.out.println(" - y: " + y);

       
    }


}
