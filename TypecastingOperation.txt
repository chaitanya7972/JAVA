public class TypecastingOperation {
    public static void main(String[] args) {
        // --- Part 1: Widening Casting (Automatic) ---
        byte b1 = 10;
        short s1 = b1;
        int i1 = b1;
        long l1 = b1;
        float f1 = b1;
        double d1 = f1;

        // Note: char c1 = b1; is NOT possible because byte is signed and char is unsigned.
        // Note: boolean b2 = b1; is NOT possible. Booleans cannot be cast to/from numbers.

        // --- Part 2: Explicit Casting Syntax ---
        byte b2 = 20;
        short s2 = b2;
        int i2 = s2;
        long l2 = i2;
        float f2 = l2;
        double d2 = f2;

        // Using explicit cast syntax (even when not strictly required)
        short s3 = (short) b2;
        int i3 = (int) s2;
        long l3 = (long) i2;
        double b5 = (double) f2;

        // --- Part 3: Interactions with Char and Long ---
        int i7 = 10;
        char c3 = (char) i7; // Explicit cast required from int to char
        short s10 = (short) c3;
        byte b10 = (byte) c3;
        int i8 = c3; // Automatic: char fits into int
        
        double d11 = (double) c3;
        char c12 = (char) d11; // Explicit cast required from double to char

        char c4 = 'A';
        double d9 = i8; 
        double d7 = c4;
        float f11 = c4;
        char c11 = (char) f11;

        // Correcting the long literal (added 'L' suffix)
        long l10 = 1000000000L; 
        float f0 = 10;
        float foo = (float) 10;

        System.out.println("Typecasting examples executed successfully.");
    }
}