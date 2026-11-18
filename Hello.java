

import java.util.Scanner;

public class Hello {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nQuiz: ");
        double Quiz = sc.nextDouble();

        System.out.print("Exam: ");
        double Exam = sc.nextDouble();

        System.out.print("Grade: ");
        double Grade = sc.nextDouble();

        double pass = computeGrade(Quiz, Exam, Grade);


        System.out.println("\n======================");


        System.out.println("\nQuiz: 20% of 75% = " + (0.20*Quiz));
        System.out.println("Exam: 30% of 75% = " + (0.30*Exam));
        System.out.println("Grade: 50% of 75% = " + (0.50*Grade));
        System.out.println("Total Average: " + pass);

        sc.close();

   }

   public static double computeGrade(double quiz, double exam, double grade) {
        double compute = 0.2 * quiz + 0.3 * exam + (double)0.5F * grade;
        return compute;
   }
}