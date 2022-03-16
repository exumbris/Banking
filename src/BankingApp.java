import java.util.Scanner;

public class BankingApp {

    private double balance;
    private String customerName;
    private String customerID;

    public static void main(String[] args) {
        BankingApp newAccount = new BankingApp(100000, "Deanne Larin", "MamaCakes927");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, " + newAccount.getName() + ". How can I help you today?");
        System.out.println("1. Deposit\n2. See Account Balance\n3. Withdraw Cash\n4. Account Settings");
        int response = scanner.nextInt();

        if(response == 1){
            Scanner depositAmount = new Scanner(System.in);
            System.out.println("How much would you like to deposit?");
            double amount = depositAmount.nextDouble();
            System.out.println("You have successfully deposited " + amount + " into your account!");
            newAccount.deposit(amount);
            System.out.println("Your new balance is " + newAccount.balance);
        }
        else if(response == 2){
            System.out.println("You currently have " + newAccount.getBalance() + " dollars in your account.");;
        }

        else if(response == 3){
            Scanner withdrawAmount = new Scanner(System.in);
            System.out.println("How much would you like to withdraw?");
            double amount = withdrawAmount.nextDouble();
            System.out.println("You have successfully withdrawn " + amount + " into your account!");
            newAccount.withDraw(amount);
            System.out.println("Your new balance is " + newAccount.balance);
        }
        else if(response == 4){
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to account settings. What would you like to do?\nA. Check name under account\nB. Check your user ID\nC. Change name under account\nD. Change your user ID");
            char choice = scan.next().charAt(0);
            if(choice  == 'A'){
                System.out.println(newAccount.getName());
            }
            else if(choice == 'B'){
                System.out.println(newAccount.getID());
            }
            else if(choice == 'C'){
                Scanner scan2 = new Scanner(System.in);
                System.out.println("What would you like to change your name to?");
                String newName = scan2.next();
                newAccount.setName(newName);
                System.out.println("Under this account, your new name is " + newAccount.getName());
            }
            else if(choice == 'D'){
                Scanner scan3 = new Scanner(System.in);
                System.out.println("What would you like your new ID to be?");
                String newID = scan3.next();
                newAccount.setID(newID);
                System.out.println("Under this account, your new ID is " + newAccount.getID());
            }
        }
        else{
            System.out.println("Error: Incorrect Input");
        }
    }

    public BankingApp(double b, String name, String id){
        balance = b;
        customerName = name;
        customerID = id;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double newBalance){
        balance = newBalance;
    }

    public String getName(){
        return customerName;
    }

    public void setName(String newName){
        customerName = newName;
    }

    public String getID(){
        return customerID;
    }

    public void setID(String newID){
        customerID = newID;
    }



    public void withDraw(double amountWithdrawn){
        balance -= amountWithdrawn;
    }

    public void deposit(double amountDeposited){
        balance += amountDeposited;
    }
}
