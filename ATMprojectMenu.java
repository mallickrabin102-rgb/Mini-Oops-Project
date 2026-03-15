import java.util.Scanner;

class Atm {
    private double balance;

    Atm(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Enter Valid Amount!");
        } else {
            balance += amount;
            System.out.println("Deposit successful!");
        }
    }

    public void withdraw(double amount) {
        if (balance>=amount) {
            balance -= amount;
            System.out.println("Withdraw Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

public class ATMprojectMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    Atm s = new Atm(5200);

int choice;
do {
    System.out.println("======ATM MENU======");
    System.out.println("1.Deposit");
    System.out.println("2.Withdraw");
    System.out.println("3.Check Balance:");
    System.out.println("4.Exit");
    System.out.println("Enter a choice:");
    choice = sc.nextInt();
    switch (choice) {
        case 1:
            System.out.println("Enter Amount To Deposit:");
            double dop = sc.nextDouble();
            s.deposit(dop);
            break;
    case 2:
        System.out.println("Enter Amount To Withdraw:");
        double with = sc.nextDouble();
        s.withdraw(with);
        break;
        case 3:
            System.out.println("Current Balance "+s.getBalance());
            break;
            case 4:
                System.out.println("Thanks For using Our ATM Services!");
                break;
        default:
            System.out.println("Invalid Choice!");
            break;
    }
} while (choice!=4);




        sc.close();
    }
}
