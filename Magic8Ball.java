import java.util.Scanner;

public class Magic8Ball
{
    public static void main(String[] args)
    {
	int numChoice = (int)(Math.random()*8) + 1;
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Think of a question for the 8-Ball...");
	
	while (numChoice >= 1 && numChoice <= 8)
	{
		System.out.println("Pick a number between 1 and 8 to get the 8-ball's decision or enter any other number to exit: ");
		numChoice = keyboard.nextInt();

		if (numChoice == 1)
		{
			System.out.println("It is certain");
		}else if (numChoice == 2){
			System.out.println("It is decidedly so");
		}else if (numChoice == 3){
			System.out.println("Most likely");
		}else if (numChoice == 4){
			System.out.println("Signs point to yes");
		}else if (numChoice == 5){
			System.out.println("Reply hazy, try again");
		}else if (numChoice == 6){
			System.out.println("Ask again later");
		}else if (numChoice == 7){							System.out.println("Don't count on it");
		}else if (numChoice == 8){
			System.out.println("My sources say no");
		}else{
			System.out.println("Good-bye!");
		}
	}

    }
}
	


	

