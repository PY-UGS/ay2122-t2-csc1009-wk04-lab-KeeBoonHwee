// for Question 1

public class BMI
{
  // private variables
  private Pound pounds;
  private Inch  inches;

  // Constructors
  public BMI(Pound pounds, Inch inches)
  {
    this.pounds = pounds;
    this.inches = inches;
  }

  public double getBMI()
  {
    double weight = this.pounds.getKilograms();
    double height = this.inches.getMeters();
    double bmi = weight / (height * height);
    return bmi;
  }

  public String interpretBMI()
  {
        double bmi = this.getBMI();
        if(bmi < 18.5)
        {
          return "Underweight";
        }
        else if(bmi < 25.0)
        {
          return "Normal";
        }
        else if(bmi < 30.0)
        {
          return "Overweight";
        }
        else
        {
          return "Obese";
        }
  }
}
