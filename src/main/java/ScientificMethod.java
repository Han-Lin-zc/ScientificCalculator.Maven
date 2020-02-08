public class ScientificMethod
{
    private int i = 0;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void switchDisplayMode(int value) {
        int binary = 1;
        int octal = 2;
        int decimal = 3;
        int hexadecimal = 4;
        i = value;

        if (i == binary) {
            System.out.println("You are now in the binary display!");
        }
        else if (i == octal) {
            System.out.println("You are now in the octal display!");
        }
        else if (i == decimal) {
            System.out.println("You are now in the decimal display!");
        }
        else if (i == hexadecimal) {
            System.out.println("You are now in the hexadecimal display!");
        } else {
            System.out.println("That is not a valid entry!");
        }

    }


}
