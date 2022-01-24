// for Question 1

public class Inch {

    private double inches;

    public Inch()
    {
        this.inches = 1.0;
    }

    public Inch(double inches)
    {
        this.inches = inches;
    }

    public double getInches()
    {
        return this.inches;
    }

    public void setInches(double inches)
    {
        this.inches = inches;
    }

    public double getMeters()
    {
        return this.inches * 0.0254;
    }
}
