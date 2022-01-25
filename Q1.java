import java.util.Scanner;

public class Q1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = input.nextDouble();

        BMI bmi = new BMI(pounds, inches);
        System.out.println("BMI is " + bmi.getBMI());
        System.out.println(bmi.interpretBMI());
        input.close();
    }
}
