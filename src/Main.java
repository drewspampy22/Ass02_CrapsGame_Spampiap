import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        boolean point = false;
        String play;
        do {
            Random rnd = new Random();
            int dice1 = rnd.nextInt(6) + 1;
            int dice2 = rnd.nextInt(6) + 1;
            int crapsRoll = dice1 + dice2;

            System.out.println("You rolled a " + dice1+ " and a " + dice2 + ". Your number is " +crapsRoll);

            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12)
            {
                System.out.println("You crapped out. You lose.");
                done = true;
            }

            else if (crapsRoll == 7 || crapsRoll == 11)
            {
                System.out.println("You got a natural and win");
                done = true;
            }
            else {
                System.out.println(crapsRoll + " is now the point. If you roll it again you win, if you roll a 7 you lose.");
                do {
                    dice1 = rnd.nextInt(6) + 1;
                    dice2 = rnd.nextInt(6) + 1;
                    int crapsRoll2 = dice1 + dice2;
                    if (crapsRoll == crapsRoll2)
                    {
                        System.out.println("You rolled a " + crapsRoll2 + ". You win!");
                        point = true;
                        done = true;
                    }
                    else if (crapsRoll2 == 7)
                    {
                        System.out.println("You rolled a " + crapsRoll2 + ". You lose!");
                        point = true;
                        done = true;
                    }
                    else
                    {
                        System.out.println("You rolled a " + crapsRoll2 + ". You get to Roll again!");
                        point = false;
                    }
                } while (!point);
            }
            System.out.print("Would you like to play again [Yes/No]: ");
                play = in.nextLine();
            if (play.equalsIgnoreCase("No")) {
                done = true;
            }
            else if (play.equalsIgnoreCase("Yes"))
            {
                done = false;
            }
        } while (!done);
    }

}