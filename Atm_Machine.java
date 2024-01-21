import java.util.Scanner;

class Atm_Machine {
    public static void main(String[] args) {
        int balance=5000,withdraw,deposit;
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println();
            System.out.println("Press 1 for Checking your Balance");
            System.out.println("Press 2 for Withdrawing");
            System.out.println("Press 3 for Deposit");
            System.out.println("Press 4 for Exit");
            System.out.println("Choose Option: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> System.out.println("Balance: Rs." + balance);
                case 2 -> {
                    System.out.println("Enter Amount to Withdraw: ");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please Collect your Money!");
                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                }
                case 3 -> {
                    System.out.println("Enter Amount to Deposit: ");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited!");
                }
                case 4 -> System.exit(0);
                default -> System.out.println("# Invalid key pressed");
            }
        }
    }
}