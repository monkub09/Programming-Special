import java.util.*;
class  BMI
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("high	 =	 ");
		double height = sc.nextDouble();
		System.out.print("Weight   =	 ");
		double weight = sc.nextDouble();
		double hm = height / 100.0;
		double bmi = weight / (hm * hm);
		System.out.println("BMI	 =	 " + bmi);

		}
}

