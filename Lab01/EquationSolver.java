import javax.swing.JOptionPane;

public class EquationSolver {
    public static void main(String[] args) {
        String menu = "CHỌN CHỨC NĂNG CẦN GIẢI:\n"
                + "1. Phương trình bậc nhất 1 ẩn (ax + b = 0)\n"
                + "2. Hệ phương trình bậc nhất 2 ẩn\n"
                + "3. Phương trình bậc hai 1 ẩn (ax^2 + bx + c = 0)\n"
                + "0. Thoát";

        String input = JOptionPane.showInputDialog(null, menu, "Equation Solver", JOptionPane.QUESTION_MESSAGE);
        if (input == null || input.isEmpty()) {
            System.exit(0);
        }

        int choice = Integer.parseInt(input);
        switch (choice) {
            case 1:
                solveLinearEquation();
                break;
            case 2:
                solveLinearSystem();
                break;
            case 3:
                solveQuadraticEquation();
                break;
            default:
                System.exit(0);
        }
        System.exit(0);
    }

    public static void solveLinearEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Nhập a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Nhập b:"));

        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "Phương trình có vô số nghiệm!");
            } else {
                JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm!");
            }
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "Phương trình có nghiệm duy nhất: x = " + x);
        }
    }

    public static void solveLinearSystem() {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog("Nhập a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog("Nhập a12:"));
        double b1  = Double.parseDouble(JOptionPane.showInputDialog("Nhập b1:"));
        double a21 = Double.parseDouble(JOptionPane.showInputDialog("Nhập a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog("Nhập a22:"));
        double b2  = Double.parseDouble(JOptionPane.showInputDialog("Nhập b2:"));

        double D  = a11 * a22 - a21 * a12;
        double D1 = b1  * a22 - b2  * a12;
        double D2 = a11 * b2  - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            JOptionPane.showMessageDialog(null, "Hệ có nghiệm duy nhất:\nx1 = " + x1 + "\nx2 = " + x2);
        } else {
            if (D1 == 0 && D2 == 0) {
                JOptionPane.showMessageDialog(null, "Hệ phương trình có vô số nghiệm!");
            } else {
                JOptionPane.showMessageDialog(null, "Hệ phương trình vô nghiệm!");
            }
        }
    }

    public static void solveQuadraticEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Nhập a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Nhập b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Nhập c:"));

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    JOptionPane.showMessageDialog(null, "Phương trình có vô số nghiệm!");
                } else {
                    JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm!");
                }
            } else {
                double x = -c / b;
                JOptionPane.showMessageDialog(null, "Do a = 0, nghiệm là x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, "Phương trình có 2 nghiệm phân biệt:\nx1 = " + x1 + "\nx2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, "Phương trình có nghiệm kép: x = " + x);
            } else {
                JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm thực!");
            }
        }
    }
}