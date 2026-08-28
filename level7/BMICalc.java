package level7;
import java.util.Scanner;

public class BMICalc {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Weight (kg): ");
	        double weight = sc.nextDouble();

	        System.out.print("Enter Height (m): ");
	        double height = sc.nextDouble();

	        double bmi = weight / (height * height);

	        System.out.println("BMI = " + bmi);

	        if (bmi < 18.5)
	            System.out.println("Underweight");
	        else if (bmi < 25)
	            System.out.println("Normal");
	        else if (bmi < 30)
	            System.out.println("Overweight");
	        else
	            System.out.println("Obese");

	        sc.close();
	    }
	}

