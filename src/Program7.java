// WAP to find income tax amount
// if income<=3L - tax=0
 // if income>3L and income<=5L - tax=5%
//  if income>5L and income<=12L - tax=8%
//  if income>12L and income<=20L - tax=10%
//  if income>20L then tax=15%
public class Program7 {
public static void main(String[] args) {
		int income =Integer.parseInt(args[0]);
		float tax=0f;
		if(income>=2000000)
			tax=0.05f;
		else if(income>=1200000)
			tax=0.1f;
		else if(income>=500000)
			tax=0.08f;
		else if(income>=300000)
			tax=0.05f;
		else
			tax=0f;
		
		float taxpaid= income*tax;
		System.out.println(taxpaid);
	}

}
