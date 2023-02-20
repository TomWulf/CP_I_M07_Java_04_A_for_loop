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
        System.out.print("Enter your message: ");
        msg = in.nextLine(); // We could loop here to make sure that we have a msg

        // Input loop as we have seen to get a valid number
        do {

            System.out.print("How many reps: ");
            if (in.hasNextInt())
            {
                numReps = in.nextInt();
                in.nextLine();
                if( numReps > 0)  // extra test to make sure we have a positive value
                   done = true;
                else
                    System.out.println("Must enter a valid number of reps [> 0]");
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid integer here. Not: " + trash);
            }

        }while (!done);
        // Now use the input data to repeat the msg
        // We consider the for loop to be a definite loop with a fixed number of repitition
        // here that is derived fom user input: numReps
        for(int r=0; r < numReps; r++) // r starts at 0 and gets incremented until it is no long < 10 e.g. 11
        {
            System.out.println(r + ". " + msg);
        }
        System.out.println("\n");
        // counting loops
        // these are loops that display their counter variable through each repetition
        // we use these to learn how to code the for loop
        // loops from 0 while less than 45 increases by 1
        for(int c = 0; c < 45; c++)
        {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");



        // Backwards for loop counter decreases
        // counter c is set to 45, loops while is it > 0, and decriments by 5
        // i.e. counts down from 45 to 5 by 5
        for(int c = 45; c > 0; c -= 5)
        {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");

        // i.e. counts down from 20 to 0 by 1
        for(int c = 20; c > 0; c--)
        {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");

        // Quick example, you can use a flaoting point value for the loop control var
        for (double temp = 0.0; temp < 120.50; temp += .1)
           System.out.printf("%8.2f\n", temp);
    }
}