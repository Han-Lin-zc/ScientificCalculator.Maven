package com.zipcodewilmington.scientificcalculator;

public class ScientificMethod {
    private static DisplayMode displayMode;
    private static double j = 0;
    private static float k = 0;
    private boolean allowNegative;
    private boolean isError;
    private boolean toggleNegative;
    private static TrigDisplayMode trigMode;

    public TrigDisplayMode getTrigDisplayMode() { return trigMode;}

    public DisplayMode getDisplayMode() {
        return displayMode;
    }

    public float getK() {
        return k;
    }

    public void setK(float k) {
        this.k = k;
    }

    public boolean isAllowNegative() {
        return allowNegative;
    }

    public void setAllowNegative(boolean allowNegative) {
        this.allowNegative = allowNegative;
    }

    public double getJ() {
        return j;
    }

    public void setJ(double j) {
        this.j = j;
    }


    public static TrigDisplayMode getTrigMode() {
        return trigMode;
    }

    public static void setDisplayMode(DisplayMode displayMode) {
        ScientificMethod.displayMode = displayMode;
    }

    public static void setTrigMode(TrigDisplayMode trigMode) {
        ScientificMethod.trigMode = trigMode;
    }

    public static void switchDisplayMode(DisplayMode value) {

        displayMode = value;

        switch (displayMode)
        {
            case BINARY:

                System.out.println("You are now in the binary display!");
                break;
            case OCTAL:
                System.out.println("You are now in the octal display!");
                break;
            case DECIMAL:
                System.out.println("You are now in the decimal display!");
                break;
            case HEXADECIMAL:
                System.out.println("You are now in the hexadecimal display!");
                break;
        }

   // public static void switchTrigDisplayMode(TrigDisplayMode value1){

            //trigMode = value1;

            //switch (trigMode)
            //{
             //   case RADIANS:
           //         Math.toRadians()

         //   }
       // }

    }

    public static double getSquare(double value) {
        double Total = 0;
        j = value;
        Total += value * value;
        return Total;
    }

    public static double sqrt(double value)
    {
     return Math.sqrt(value);
    }

    public static float invSqrt(float value)
    {
        float valueHalf = 0.5f * value;
        int i = Float.floatToIntBits(value);
        i = 0x5f3759df - (i >> 1);
        value = Float.intBitsToFloat(i);
        value *= (1.5f - valueHalf * value * value);
        return value;
    }

    public static double getSin(double value)
    {
        double degrees = value;

        double radians = Math.toRadians(degrees);
        double sinValue = Math.sin(radians);
        return sinValue;
    }

    public static double getCos(double value)
    {
        double degrees = value;

        double radians = Math.toRadians(degrees);
        double cosValue = Math.cos(radians);
        return cosValue;
    }

    public static double getTan(double value)
    {
        double degrees = value;

        double radians = Math.toRadians(degrees);
        double tanValue = Math.tan(radians);
        return tanValue;

    }

    public static double getInverseSin(double value)
    {
        double degrees = value;

        double radians = Math.toRadians(degrees);
        double inverseSinValue = Math.asin(radians);
        return inverseSinValue;

    }

    public static double getInverseCos(double value)
    {
        double degrees = value;

        double radians = Math.toRadians(degrees);
        double inverseCosValue = Math.acos(radians);
        return inverseCosValue;

    }

    public static double getInverseTan(double value)
    {
        double degrees = value;

        double radians = Math.toRadians(degrees);
        double inverseTanValue = Math.atan(radians);
        return inverseTanValue;

    }

    public static double getLog(double value)
    {
        double degrees = value;
        double logValue = Math.log(degrees);
        return logValue;

    }

    public static double getInverseLog(double value)
    {
     double invLogValue = Math.exp(Math.log(value));
     return invLogValue;
    }

    public static double getFactorial(double factorial, double value)
    {
        for (int i = 1; i <= value; ++i )
        {
           factorial *= i;
        }
        return factorial;
    }

    public static enum DisplayMode
    {
        BINARY,
        OCTAL,
        DECIMAL,
        HEXADECIMAL;

    }

    public static enum TrigDisplayMode
    {
        RADIANS,
        DEGREES;
    }


}
