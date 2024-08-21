// WAP to find average of 3 numbers
public class Arguments2 {
	void average(int a,int b,int c) {
		int avg=(a+b+c)/3;
		System.out.println(avg);
	}

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		Arguments2 obj= new Arguments2();
		obj.average(a, b, c);
		
		
	}

}
