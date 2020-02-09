public class ScientificMethod {
    private DisplayMode displayMode;
    private double j = 0;
    private float k = 0;
    private boolean allowNegative;
    private boolean isError;

    public DisplayMode getDisplayMode() {
        return displayMode;
    }

    public float getK() {
        return k;
    }

    public void setK(float k) {
        this.k = k;
    }

    public boolean isError() {
        return isError;
    }

    public void setError(boolean error) {
        isError = error;
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


    public void switchDisplayMode(DisplayMode value) {

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


    }

    public String getSquare(double value) {
        String Total = "";
        j = value;
        Total += value * value;
        return Total;
    }

    public float sqrt(float value)
    {

     k = value;
     return value;
    }

    public static float invSqrt(float value)
    {
        float valuehalf = 0.5f * value;
        int i = Float.floatToIntBits(value);
        i = 0x5f3759df - (i >> 1);
        value = Float.intBitsToFloat(i);
        value *= (1.5f - valuehalf * value * value);
        return value;
    }

    public double getSin(double value)
    {
        double degrees = value;

        double radians = Math.toRadians(degrees);
        double sinValue = Math.sin(radians);
        return sinValue;
    }

    public double getCos(double value)
    {
        double degrees = value;

        double radians = Math.toRadians(degrees);
        double cosValue = Math.cos(radians);
        return cosValue;
    }

    public double getTan(double value)
    {
        double degrees = value;

        double radians = Math.toRadians(degrees);
        double tanValue = Math.tan(radians);
        return tanValue;

    }

    public double getInverseSin(double value)
    {
        double degrees = value;

        double radians = Math.toRadians(degrees);
        double inverseSinValue = Math.asin(radians);
        return inverseSinValue;

    }

    public double getInverseCos(double value)
    {
        double degrees = value;

        double radians = Math.toRadians(degrees);
        double inverseCosValue = Math.acos(radians);
        return inverseCosValue;

    }

    public double getInverseTan(double value)
    {
        double degrees = value;

        double radians = Math.toRadians(degrees);
        double inverseTanValue = Math.atan(radians);
        return inverseTanValue;

    }

    public double getLog(double value)
    {
        double degrees = value;
        double radians = Math.toRadians(degrees);
        double logValue = Math.log(value);
        return logValue;

    }

    public static enum DisplayMode
    {
        BINARY,
        OCTAL,
        DECIMAL,
        HEXADECIMAL;

    }
}
