import java.util.Scanner;

public class Main {

    //scanner for gathering inputs//
    Scanner userInput = new Scanner(System.in);

    //method for getting the outcome of match//
    public static void getOutcome() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Was this a Win or a Loss?: ");
        String winOrLoss = userInput.next();
        boolean win = Boolean.valueOf(winOrLoss);
            if (!win) {
                System.out.print("What was the match length? (Minutes:seconds): ");
                String matchTime = userInput.next();
                System.out.println("Loss recorded at " + matchTime);
            } else {
                System.out.print("Was the win by submission? (Y / N): ");
                boolean answer = userInput.next().toLowerCase().startsWith("y");
                    if (answer) {
                        System.out.print("What submission was used?: ");
                        String subUsed = userInput.next();
                        System.out.println("Win recorded by " + subUsed);
                    } else {
                        System.out.print("What was the point total?: ");
                        String pointTotal = userInput.next();
                        System.out.println("Win recorded by points with " + pointTotal + " points.");
                    }
            }
        }





    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome.");
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
            userInput.nextLine();
        }
        catch(Exception e)
        {}

        getOutcome();

    //Switch Statement for which sub


    }
}