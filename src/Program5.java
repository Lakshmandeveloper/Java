//WAP to check leap year or not
public class Program5 {

	public static void main(String[] args) {
		int year =Integer.parseInt(args[0]);
		if((year%400 ==0) || (year%4==0 && year%100!=0))
			System.out.println("leap year");
		else
			System.out.println("not a leap year");

	}

}
