import java.util.Scanner;

public class TempConversionCopy
{
    public static void main(String[] args)
    {

	double temp, result;
	char type;
	char entry;
	Scanner keyboard = new Scanner(System.in);
	
	while(true)
	{
		System.out.println("Enter the temperature: ");
			temp = keyboard.nextDouble();
		System.out.println("Enter the type of temperature: C/c for Celsius or F/f for Fahrenheit: ");
		System.out.println("Enter 'Q' quit");

		type = keyboard.next().charAt(0);
		
		if (type == 'F' || type == 'f')
		{
			result = 5*(temp-32)/9.0;
			System.out.println("Your entered temp: " + temp + ". This in Fahrenheit is: " + result);
			System.out.println("Enter any other letter to try-again");
			System.out.println("or enter 'Q' to exit the program");
			entry = keyboard.next().charAt(0);
				if (entry == 'Q' || entry == 'q')
				{
					System.out.println("Good-Bye!");
					break;
				}else{
					continue;
				}
		}else if (type == 'C' || type == 'c'){
			result = (9*temp/5.0) + 32;
			System.out.println("Your entered temp: " + temp + ". This in Celsius is: " + result);
			System.out.println("Enter any other letter to try-again");
			System.out.println("or enter 'Q' to exit the program");
			entry = keyboard.next().charAt(0);
				if (entry == 'Q' || entry == 'q')
				{
					System.out.println("Good-Bye!");
					break;
				}else{
					continue;
				}
		}else if (type == 'Q' || type == 'q'){
			System.out.println("Good-Bye");
			break;
		}else{
			System.out.println("Try-Again");
		}	
		
	}	
	
    }
}
	


	

