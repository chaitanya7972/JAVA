public class Account {

    public static void main(String[] args) {

        double balance = 2500;
        double t1;

        double deposit = 2500;
        balance = balance + deposit;
        t1 = balance;

        double t2;

        double withdrawal = 1500;
        balance = balance - withdrawal;
        t2 = balance;

        double t3;

        double transfer = 1000;
        balance = balance - transfer;
        t3 = balance;

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}