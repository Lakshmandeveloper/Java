// WAP using a method and pass arguments and check odd or even
public class Arguments1 {
	void check(int n) // formal argument
	{
		if(n%2==0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
	}

	public static void main(String[] args) {
		Arguments1 p=new Arguments1();
		p.check(10);
		p.check(25);
		

	}

}
