public class TemperatureChart
{
    public static void main(String[] args)
    {
        double fVal = 0.0;
        double cVal = 0.0;

        System.out.println("\tFarenheit   Celsius");
        for(fVal = 0.0; fVal < 150; fVal += .1)
        {
            // Deduct 32, then multiply by 5, then divide by 9
            cVal = (fVal - 32.0) * 5.0/9;

            System.out.printf("%10.2f %10.2f\n", fVal, cVal);
        }
    }
}
