import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String msg = "";
        int numReps = 0;
        String trash = "";
        boolean done = false;

        for(int r=0; r < 10; r++) // r starts at 0 and gets incremented until it is no long < 10 e.g. 11
        {
            System.out.println("" + r + ". Hello!");
        }

        // Now lets do two inputs get the number of reps and the msg to repeat
        System.out.print("Enter your messaage: ");
        msg = in.nextLine();

        do {

            System.out.print("How many reps: ");
            if (in.hasNextInt()) {
                numReps = in.nextInt();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid integer here. Not: " + trash);
            }

        }while (!done);

        for(int r=0; r < numReps; r++) // r starts at 0 and gets incremented until it is no long < 10 e.g. 11
        {
            System.out.println("" + r + ". " + msg);
        }
    }
}