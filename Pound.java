// for Question 1

public class Pound {

    private double pounds;

    public Pound()
    {
        this.pounds = 1.0;
    }

    public Pound(double pounds)
    {
        this.pounds = pounds;
    }

    public double getPounds()
    {
        return this.pounds;
    }

    public void setPounds(double pounds)
    {
        this.pounds = pounds;
    }

    public double getKilograms()
    {
        return this.pounds * 0.45359237;
    }
}
