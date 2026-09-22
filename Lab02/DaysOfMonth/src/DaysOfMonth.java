import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = -1;
        int month = -1;

        while (true) {
            System.out.print("Enter month (e.g., January, Jan., Jan, or 1): ");
            String monthInput = scanner.nextLine().trim();

            System.out.print("Enter year (non-negative integer with full digits): ");
            String yearInput = scanner.nextLine().trim();

            month = parseMonth(monthInput);
            year = parseYear(yearInput);

            if (month != -1 && year != -1) {
                break; 
            } else {
                System.out.println("Invalid month or year entered. Please try again!\n");
            }
        }

        int days = getDaysInMonth(month, year);
        System.out.println("Number of days: " + days);

        scanner.close();
    }

    private static int parseMonth(String input) {
        if (input == null || input.isEmpty()) return -1;

        try {
            int m = Integer.parseInt(input);
            if (m >= 1 && m <= 12) return m;
            return -1;
        } catch (NumberFormatException e) {}

        String str = input.toLowerCase();
        if (str.endsWith(".")) {
            str = str.substring(0, str.length() - 1);
        }

        switch (str) {
            case "january": case "jan": return 1;
            case "february": case "feb": return 2;
            case "march": case "mar": return 3;
            case "april": case "apr": return 4;
            case "may": return 5;
            case "june": case "jun": return 6;
            case "july": case "jul": return 7;
            case "august": case "aug": return 8;
            case "september": case "sep": case "sept": return 9;
            case "october": case "oct": return 10;
            case "november": case "nov": return 11;
            case "december": case "dec": return 12;
            default: return -1;
        }
    }

    private static int parseYear(String input) {
        if (input == null || input.isEmpty()) return -1;

        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return -1;
            }
        }

        try {
            int y = Integer.parseInt(input);
            return (y >= 0) ? y : -1;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;
        }
    }
}