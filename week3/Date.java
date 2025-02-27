import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day of the week: ");
        String day = scanner.next();
        System.out.print("Enter month: ");
        String month = scanner.next();
        System.out.print("Enter date: ");
        int date = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        System.out.println("\nDate in American format: " + day + ", " + month + " " + date + ", " + year);
        System.out.println("Date in European format: " + day + " " + date + " " + month + " " + year);
        System.out.println("Date in Japanese format: " + year + " " + month + " " + date + " " + day);
    }
}
