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
		double h = height / 100.0;
		double bmi = weight / (h * h);
		System.out.println("BMI	 =	 " + bmi);

		}
}

