// WAP to find simple interest 
public class Program3 {

		public static void main(String[] args) 
		{
			int p=Integer.parseInt(args[0]);
			int t=Integer.parseInt(args[1]);
			int r=Integer.parseInt(args[2]);
			float si=(p*t*r)/100;
			System.out.println(si);
		}
	}


