import javax.swing.JOptionPane;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        String n1, n2;

        n1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ", "Input First Number",
                JOptionPane.INFORMATION_MESSAGE);
        double s1 = Double.parseDouble(n1);

        n2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ", "Input Second Number",
                JOptionPane.INFORMATION_MESSAGE);
        double s2 = Double.parseDouble(n2);

        double tong = s1 + s2;
        double hieu = s1 - s2;
        double tich = s1 * s2;

        String resultMsg = "First number: " + s1 + "\n"
                + "Second number: " + s2 + "\n"
                + "Sum: " + tong + "\n"
                + "Difference: " + hieu + "\n"
                + "Product: " + tich + "\n";

        if (s2 != 0) {
            double thuong = s1 / s2;
            resultMsg += "Quotient: " + thuong;
        } else {
            resultMsg += "Quotient: Cannot divide by zero";
        }

        JOptionPane.showMessageDialog(null, resultMsg,
                "Calculation Results", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}