// Leap Year: Check if a given year is a leap leap year or not.



class LeapYearCheck {
    public static void main(String[] args) {
        
        int year = 2024; // You can change this to 1900 or 2000 to test

        if (year % 400 == 0) {
            System.out.println("Leap Year");
        } 
        else if (year % 100 == 0) {
            System.out.println("Not a Leap Year");
        } 
        else if (year % 4 == 0) {
            System.out.println("Leap Year");
        } 
        else {
            System.out.println("Not a Leap Year");
        }
    }
}