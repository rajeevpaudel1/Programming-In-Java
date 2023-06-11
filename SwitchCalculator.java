import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scan.nextInt();

        System.out.println("Press 1 to perform addition");
        System.out.println("Press 2 to perform subtraction");
        System.out.println("Press 3 to perform multiplication");
        System.out.println("Press 4 to perform division");

        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("The sum of the two numbers is " + (num1 + num2));
                break;
            case 2:
                System.out.println("The subtraction of the two numbers is " + (num1 - num2));
                break;
            case 3:
                System.out.println("The multiplication of the two numbers is " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("The division of the two numbers is " + (num1 / num2));
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
