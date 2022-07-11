import javax.swing.JOptionPane; // Needed for Dialog Box

public class Converter
{
    public static void main(String[] args)
    {
        String input; // To hold String input.
        double c; // To hold temperature in celcius.
        double f; // To hold temperature in fahrenheit.

        // Prompt user to input temperature.
        input = JOptionPane
                .showInputDialog("Enter temperature in Celcius");

        // Convert the String input to a double.
        c = Double.parseDouble(input);

        // Calculate temperature in fahrenheit.
        f = 1.8 * c + 32;

        // Display temperature in Fahrenheit.
        JOptionPane.showMessageDialog(null,
                "Temperature in Fahrenheit is " + f);
    }
}