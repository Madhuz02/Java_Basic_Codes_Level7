package level7;
import java.util.Scanner;
public class TimeConvert {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Total Seconds: ");
	        int sec = sc.nextInt();

	        int hours = sec / 3600;
	        int minutes = (sec % 3600) / 60;
	        int seconds = sec % 60;

	        System.out.println("Hours = " + hours);
	        System.out.println("Minutes = " + minutes);
	        System.out.println("Seconds = " + seconds);

	        sc.close();
	    }
	}

