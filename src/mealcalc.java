import java.util.Scanner;
public class mealcalc {
    /*
    First Create static double solve
    Set up double for cost, int for tip percent, and int for tac percent
    Set up calculations using double for the tip,tax, and total cost
    Set up the code to round the total cost
    Create Print statement that includes the total meal cost
    Create Public static void main
    Set up my scanner
    Then create a print statement for the meal cost using nextDouble
    Then create a print statement for the tip cost using nextInt
    Then create a print statement for the tax cost using nextInt
    THen set up the solve statement including meal cost, tip percent, and tax percent
    */


// codes written from formulas given
        static double solve ( double mealCost, int tipPercent, int taxPercent){
            double tip = (mealCost * tipPercent) / 100;
            double tax = (mealCost * taxPercent) / 100;
            double totalcost = mealCost + tip + tax;

            // the total meal cost
            int totalCost = (int)Math.round(totalcost);
// printing final statement for user
            System.out.println("The total meal cost is " + totalCost + " dollars");
            return tip;
        }

        public static void main (String[]args){
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("what is the cost of the meal?");
            double mealCost = Keyboard.nextDouble();
            System.out.println("How much tip do you want to give?");
            int tipPercent = Keyboard.nextInt();
            System.out.println("What is the tax?");
            int taxPercent = Keyboard.nextInt();
            solve(mealCost,tipPercent,taxPercent);
        }
    }



