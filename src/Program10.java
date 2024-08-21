//wap to print numbers from 1 to 10  using for,while,do-while 
public class Program10 {

	public static void main(String[] args) {
		int choice=Integer.parseInt(args[0]);
		if(choice==1) {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		}
		else if(choice==2) {
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
			}
		}
		else if(choice==3) {
			int i=1;
			do {
				System.out.println(i);
				i++;
				}while(i<=10);
		}
		
}

}
