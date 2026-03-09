//Age Group: Categorize age into "hild" (<12), "Teen" (13-19), "Adult" (20-59), "Senior" (60+).

class AgeGroup {
    public static void main(String[] args) {
        
        int age = 25; // Change this to 10, 15, or 70 to test

        if (age < 13) {
            System.out.println("Category: Child");
        } 
        else if (age <= 19) {
            System.out.println("Category: Teen");
        } 
        else if (age <= 59) {
            System.out.println("Category: Adult");
        } 
        else {
            System.out.println("Category: Senior");
        }
        
    }
}