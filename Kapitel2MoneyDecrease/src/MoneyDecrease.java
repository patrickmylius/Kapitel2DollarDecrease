import java.util.Scanner;


public class MoneyDecrease {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Recieve the amount
        System.out.println("Enter an amount in double, for example (12.50)");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        // Find the number of one dollar(s)
        int numberOfDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        //Find the number of quarters in the remaning amount
        int numberOFQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        //Find the number of dimes in the remaining
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        //Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;


        //Fint the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        //Printing results
        System.out.println(" Your amount " + amount + " consists of");
        System.out.println(" " + numberOfDollars + " dollars");
        System.out.println(" " + numberOFQuarters + " quarters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels" );
        System.out.println(" " + numberOfPennies + " pennies");


    }
}
