//WAP  to find average of following inputs
public class Program6 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int d=Integer.parseInt(args[3]);
		int avg=(a+b+c+d)/5;
		System.out.println(avg);
		if(avg>=70)
			System.out.println("Distinction");
		else if(avg>=60)
			System.out.println("First class");
		else if(avg>=50)
			System.out.println("Second class");
		else
			System.out.println("fail");
	}
}
		