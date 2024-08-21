//WAP to guess the value from 0 to 100

import java.util.Scanner;
import java.util.Random;

public class Program12 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int system=r.nextInt(100);
		while(true) {
			System.out.println("enter a number between 0 to 100");
			int user=sc.nextInt();
			if(user==system) {
				System.out.println("correct guess");
				System.exit(0);
			}
			else if(user>system)
				System.out.println("Guess lower number");
			else
				System.out.println("Guess higher number");
			
		}
		
	}

}
