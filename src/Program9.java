/* WAP to calculate total distance covered
  mileage = 15km/liter
  conditions
  1) bad roads : mileage-1
  2) uphill    : mileage-2.5
  3) downhill  : mileage+1
  4) winter    : mileage-1.5
  5) Summer    : mileage-0.5 */
public class Program9 {
	public static void main(String[] args) {
		int condition=Integer.parseInt(args[0]);
		int fuel=Integer.parseInt(args[1]);
		float mileage=15.0f;
		if(condition==1) {
			mileage=mileage-1;
		}
		else if(condition==2) {
			mileage=mileage-2.5f;
		}
		else if(condition==3) {
			mileage=mileage+1;
		}
		else if(condition==4) {
			mileage=mileage-1.5f;
		}
		else if(condition==5) {
			mileage=mileage-0.5f;
		}
		else
			System.exit(0);
		float tot_distance=mileage*fuel;
		System.out.println("Disatnce travelled is"  +tot_distance +"Kms");
		

	}
 
}
