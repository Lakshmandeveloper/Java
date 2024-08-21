//WAP for discount, if amount>=2000, then 25% discount 
public class Program4 {

	public static void main(String[] args) {
		double amount =Double.parseDouble(args[0]);
		double discount =0;
		if(amount >=2000) {
			discount=0.25;
		}
		double total=amount *discount;
		System.out.println(total);

	}

}
