public class LogicalOperatorProgram {

    public static void main(String[] args) {

        // AND Operator (&&)
        System.out.println(true && true);   // true
        System.out.println(true && false);  // false
        System.out.println(false && true);  // false
        System.out.println(false && false); // false

        // OR Operator (||)
        System.out.println(true || true);   // true
        System.out.println(true || false);  // true
        System.out.println(false || true);  // true
        System.out.println(false || false); // false

        // NOT Operator (!)
        System.out.println(!true);          // false
        System.out.println(!false);         // true

        // Complex Expressions from your notes
        System.out.println(20 > 30 && 40 < 20); 
        // 20 > 30 is false -> output false

        System.out.println(40.0 < 20.0 && 40 > 'A'); 
        // 40.0 < 20.0 is false -> output false

        System.out.println("hello" == "hello" && "java" != "java"); 
        // true && false -> output false 
        System.out.println(!(10 < 20.0)); 
        // !(true) -> output false

        System.out.println('A' < 'a' && !("hello" == "hello")); 
        // true && !(true) -> false

        System.out.println(true && !('e' < 'a')); 
        // true && !(false) -> true

        System.out.println(10 < 'a' || (!true)); 
        // 10 < 97 (true) || false -> output true
    }
}