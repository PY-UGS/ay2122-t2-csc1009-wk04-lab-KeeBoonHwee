import java.util.Scanner;

public class Q1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPound = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        Pound pounds = new Pound(weightInPound);
        Inch inches = new Inch(heightInInches);
        BMI bmi = new BMI(pounds, inches);

        System.out.println("BMI is " + bmi.getBMI());
        System.out.println(bmi.interpretBMI());
        input.close();
    }
}
