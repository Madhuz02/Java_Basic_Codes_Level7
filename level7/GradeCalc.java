package level7;
import java.util.Scanner;
public class GradeCalc {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Marks of 5 Subjects: ");
	        int s1 = sc.nextInt(), s2 = sc.nextInt(), s3 = sc.nextInt(), s4 = sc.nextInt(), s5 = sc.nextInt();

	        double per = (s1 + s2 + s3 + s4 + s5) / 5.0;

	        System.out.println("Percentage = " + per + "%");

	        if (per >= 90)
	            System.out.println("Grade A");
	        else if (per >= 80)
	            System.out.println("Grade B");
	        else if (per >= 70)
	            System.out.println("Grade C");
	        else if (per >= 60)
	            System.out.println("Grade D");
	        else
	            System.out.println("Grade F");

	        sc.close();
	    }
	}

