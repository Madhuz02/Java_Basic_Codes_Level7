package level7;
import java.util.Scanner;
public class Currency {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Amount: ");
	        int amt = sc.nextInt();

	        System.out.println("500 = " + amt / 500);
	        amt %= 500;

	        System.out.println("200 = " + amt / 200);
	        amt %= 200;

	        System.out.println("100 = " + amt / 100);
	        amt %= 100;

	        System.out.println("50 = " + amt / 50);
	        amt %= 50;

	        System.out.println("20 = " + amt / 20);
	        amt %= 20;

	        System.out.println("10 = " + amt / 10);
	        amt %= 10;

	        System.out.println("5 = " + amt / 5);
	        amt %= 5;

	        System.out.println("2 = " + amt / 2);
	        amt %= 2;

	        System.out.println("1 = " + amt);

	        sc.close();
	    }
	}

