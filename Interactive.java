
import java.util.Scanner;

public class Interactive {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println();

		System.out.print("Grade: ");
		double x = scan.nextDouble();

		System.out.print("Quiz: ");
		double y = scan.nextDouble();

		System.out.print("Exam: ");
		double z = scan.nextDouble();

		
	
		System.out.println();
		System.out.println("--------------------");
		System.out.println();
	
		System.out.println("20% of 75.0 = " + (0.20*x));
		System.out.println("30% of 75.0 = " + (0.30*y));
		System.out.println("50% of 75.0 = " + (0.50*z));
		System.out.println("Total Grade = " + computeGrade(x, y, z));

		scan.close();
	
	}
	public static double computeGrade(double grade, double quiz, double exam) {
		return (0.20*grade + 0.30*quiz + 0.50*exam);
		

	}
}