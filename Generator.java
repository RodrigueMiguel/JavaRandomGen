// package prng;
// import java.util.Random;
// import java.util.Scanner;



// public class Generator
// {

// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner(System.in);  
		
// 		int expectedRandomValue1 = -664929729;
// 		int RandomValue1 = new Random(0).nextInt();
		
// 		int y = 1;
// 		while (RandomValue1 != expectedRandomValue1) {
// 			RandomValue1 = new Random(y).nextInt();
// 			y++;
// 		}

// 		System.out.println(y-1);



// 		long seed = sc.nextLong();
// 		System.out.println("Your seed is: " + seed);
// 		Random rand = new Random(seed);
		
// 		for(int i = 1; i < 11; i++)
// 		{	
// 			int expectedValue = rand.nextInt();
// 			System.out.println("Random Value #" + i + ": " + expectedValue);
// 		}
		
// 		int expectedValue = rand.nextInt();
// 		System.out.println("The secret code is: FLAG-" + expectedValue );
		
// 	}
	
// }


package prng;
import java.util.Random;
import java.util.Scanner;



public class Generator
{

	public static void main(String... args)
	{
		Scanner sc=new Scanner(System.in);  
		
		System.out.println("Please provide a seed for the random generation of your secret code.");
		long seed = sc.nextLong();
		System.out.println("Your seed is: " + seed);
		Random rand = new Random(seed);
		
		for(int i = 1; i < 11; i++)
		{	
			int expectedValue = rand.nextInt();
			System.out.println("Random Value #" + i + ": " + expectedValue);
		}
		
		int expectedValue = rand.nextInt();
		System.out.println("The secret code is: FLAG-" + expectedValue );
		
	}
	
}

