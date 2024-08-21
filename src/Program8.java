/*WAP for travel agency?
  1) Male
      a) child : 0.5r/KM (age<12)
      b) adult : 1.2r/KM
  2) Female
      a) child : 0.5r/KM
      b) adult : 0.9r/KM
  3) PH
      a) child : 0r/KM
      b) adult : 0.3r/KM
total = distance * charge */
public class Program8 {
	public static void main(String[] args) {
		double distance =Double.parseDouble(args[0]);
		int choice=Integer.parseInt(args[1]);
		int age=Integer.parseInt(args[2]);
		double charge=0.0;
		if(choice==1){
			if(age<=12)
				charge=0.5;
			else
				charge=1.2;
			}
		else if(choice==2) {
			if(age<=12)
				charge=0.5;
			else
				charge=0.9;
			}
		else {
			charge=0;
		}
		double total= distance *charge;
		System.out.println("Bus charge is rs." +total );

	}

}
