import java.util.Scanner;
public class SmartConverter {
    // SCOPE: 'scanner' is static, so it is visible to ALL methods in this class.
    static Scanner scanner = new Scanner(System.in);

    // RECURSION: This method will call itself until the user chooses Exit.
public  static void menu() {
        System.out.println("Welcome to Smart Converter");
        System.out.println("1. Convert from Celsius to Fahrenheit");
        System.out.println("2. Convert from Fahrenheit to Celsius");
        System.out.println("3. Convert from km to miles");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("loading...");
                System.out.println("Celsius to Fahrenheit Conversion");
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
                menu(); // RECURSION: Call menu again
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahr = scanner.nextDouble();
                double cels = (fahr - 32) * 5/9;
                System.out.println(fahr + " Fahrenheit is " + cels + " Celsius");
                menu(); // RECURSION: Call menu again
                break;
            case 3:
                System.out.print("Enter distance in kilometers: ");
                double km = scanner.nextDouble();
                double miles = km * 0.621371;
                System.out.println(km + " kilometers is " + miles + " miles");
                menu(); // RECURSION: Call menu again
                break;
            case 4:
                System.out.println("Exiting Smart Converter. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                menu(); // RECURSION: Call menu again
                break;
        }
    }

    public static void main(String[] args) {
        menu(); // Start the menu
    }
}
