import java.util.Scanner;

public class StatisticsLoop
{
    public static void main(String[] args)
    {
	int count = 0;
	int largest = 0;
	int smallest = 0;
	int inNum = 0;
	int sum = 0;
	double avg;
	
	
	Scanner keyboard = new Scanner(System.in);
	
	while (inNum >= 0)
	{
		System.out.println("Enter a number or any negative number to end");
		
		inNum = keyboard.nextInt();
		if(inNum >= 0)
		{
			if(count == 0)
			{
				largest = inNum;
				smallest = inNum;

			}
			else
			{
				if(inNum > largest)
					largest = inNum;
				if(inNum < smallest)
					smallest = inNum;
	
			}
			
			sum += inNum;
			count++;
			
		}
	}
	System.out.println();
	if(count > 0)
	{
		avg = (double)sum / (double)count;
		System.out.println("For the " + count + " numbers you entered...");
		System.out.println("The largest value = " + largest);
		System.out.println("The smallest value = " + smallest);
		System.out.println("The average is = " + avg);
	}
	else 
	{
		System.out.println("You did not enter any positive integers.");
	}

    }
}
	


	

