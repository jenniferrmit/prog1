public class Date {
    public static void main(String[] args) {
        // Declare string variables
        String day = "Wednesday";
        String month = "February";
        
        // Declare integer variables
        int date = 19;
        int year = 2025;

        // Output in different formats
        System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
        System.out.println("European format: " + day + " " + date + " " + month + " " + year);
        System.out.println("Japanese format: " + year + " " + month + " " + date + " " + day);
    }
}