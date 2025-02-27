import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name of student 1: ");
        String name1 = scanner.next();
        System.out.print("Enter age of " + name1 + ": ");
        int age1 = scanner.nextInt();

        System.out.print("Enter name of student 2: ");
        String name2 = scanner.next();
        System.out.print("Enter age of " + name2 + ": ");
        int age2 = scanner.nextInt();

        System.out.print("Enter name of student 3: ");
        String name3 = scanner.next();
        System.out.print("Enter age of " + name3 + ": ");
        int age3 = scanner.nextInt();

        System.out.print("Enter name of student 4: ");
        String name4 = scanner.next();
        System.out.print("Enter age of " + name4 + ": ");
        int age4 = scanner.nextInt();

        System.out.print("Enter name of student 5: ");
        String name5 = scanner.next();
        System.out.print("Enter age of " + name5 + ": ");
        int age5 = scanner.nextInt();

        System.out.println("\nStudent Names and Ages:");
        System.out.println(name1 + " - Age: " + age1);
        System.out.println(name2 + " - Age: " + age2);
        System.out.println(name3 + " - Age: " + age3);
        System.out.println(name4 + " - Age: " + age4);
        System.out.println(name5 + " - Age: " + age5);
    }
}
