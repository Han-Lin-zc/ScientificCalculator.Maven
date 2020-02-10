package com.zipcodewilmington.scientificcalculator;

public class ScientificMethod {
    private static DisplayMode displayMode;
    private static double j = 0;
    private static float k = 0;
    private boolean allowNegative;
    private boolean toggleNegative;
    private static TrigDisplayMode trigMode = TrigDisplayMode.DEGREES;

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


    public static void switchDisplayMode(DisplayMode value) {

        displayMode = value;

        switch (displayMode) {
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
    }
   public static void switchTrigDisplayMode(TrigDisplayMode value1){

        trigMode = value1;

        switch (trigMode)
        {
            case RADIANS:
                System.out.println("You are now in radians.");
                break;
            case DEGREES:
                System.out.println("You are now in degrees.");
                break;


        }
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

    public static double getSin(double value, TrigDisplayMode trigDisplay)
    {
        if (trigDisplay == TrigDisplayMode.DEGREES){
            double degrees = value;
            double radians = Math.toRadians(degrees);
            double sinValue = Math.sin(radians);
            return sinValue;
        } else {
            double sinValue = Math.sin(value);
            return sinValue; }
    }

    public static double getCos(double value, TrigDisplayMode trigDisplay)
    {
       if (trigDisplay == TrigDisplayMode.DEGREES){
           double degrees = value;
           double radians = Math.toRadians(degrees);
           double cosValue = Math.cos(radians);
           return  cosValue;
       } else {
           double cosValue = Math.cos(value);
           return cosValue; }

    }

    public static double getTan(double value, TrigDisplayMode trigDisplay)
    {
        if (trigDisplay == TrigDisplayMode.DEGREES){
            double degrees = value;
            double radians = Math.toRadians(degrees);
            double tanValue = Math.tan(radians);
            return tanValue;
        } else {
            double tanValue = Math.tan(value);
            return tanValue; }

    }

    public static double getInverseSin(double value, TrigDisplayMode trigDisplay)
    {
        if (trigDisplay == TrigDisplayMode.DEGREES) {
            double degrees = value;

            double radians = Math.toRadians(degrees);
            double inverseSinValue = Math.asin(radians);
            return inverseSinValue;
        }
            else{
                double inverseSinValue = Math.asin(value);
                return inverseSinValue;

    }

    }

    public static double getInverseCos(double value, TrigDisplayMode trigDisplay)
    {
        if (trigDisplay == TrigDisplayMode.DEGREES){
        double degrees = value;
        double radians = Math.toRadians(degrees);
        double inverseCosValue = Math.acos(radians);
        return inverseCosValue;
        }
        else {
            double inverseCosValue = Math.acos(value);
            return inverseCosValue;
        }
    }

    public static double getInverseTan(double value, TrigDisplayMode trigDisplay)
    {
        if (trigDisplay == TrigDisplayMode.DEGREES){
        double degrees = value;
        double radians = Math.toRadians(degrees);
        double inverseTanValue = Math.atan(radians);
        return inverseTanValue;
        }
        else {
            double inverseTanValue = Math.atan(value);
            return inverseTanValue;
        }

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

    public enum DisplayMode
    {
        BINARY,
        OCTAL,
        DECIMAL,
        HEXADECIMAL;
        public String toString()
        {
            return this.toString().toLowerCase().replace("_", " ");
        }

    }

    public enum TrigDisplayMode
    {
        RADIANS,
        DEGREES;
    }


}
