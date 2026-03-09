/* 1): Create a program that takes a student's marks (0-100) and assigns a grade based on
the following criteria:
90 and above: A
80 to 89: B
70 to 79: C
60 to 69: D
Below ow 60: F */


class StudentGrading {
    public static void main(String[] args) {
        
        // This is where you set the marks manually, like 'smith_wallet'
        int marks = 85; 

        if (marks >= 90) {
            System.out.println("Grade: A");
        } 
        else if (marks >= 80) {
            System.out.println("Grade: B");
        } 
        else if (marks >= 70) {
            System.out.println("Grade: C");
        } 
        else if (marks >= 60) {
            System.out.println("Grade: D");
        } 
        else {
            // This acts like your 'else' for drinking water
            System.out.println("Grade: F");
        }
        
    }
}