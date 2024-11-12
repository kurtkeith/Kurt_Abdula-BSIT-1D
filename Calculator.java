import java.util.Scanner;

public class SimpleLogin {

    private static final String USERNAME = "kurt";
    private static final String PASSWORD = "keith";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Imong username: ");
            String inputUsername = scanner.nextLine();

            System.out.println("Imong password: ");
            String inputPassword = scanner.nextLine();

            if (inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)) {
                System.out.println("Log in Succesfully");
                break;
            } else {
                System.out.println("Ulol mali imong password ug username BOBO amp");
            }
        }

        System.out.println("Welcome sa calculator nigga");
        System.out.print("GIVE A NUMBER: ");
        double num1 = scanner.nextDouble();

        System.out.print("GIVE ANOTHER NUMBER: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nPICK ONE BRO:");
        System.out.println("NUMBER 1. ADDITION ( + )");
        System.out.println("NUMBER 2. SUBTRACTION ( - )");
        System.out.println("NUMBER 3. MULTIPLICATION ( × )");
        System.out.println("NUMBER 4. DIVISION ( ÷ )");

        int choice = scanner.nextInt();
        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("RESULT: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("RESULT: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("RESULT: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("RESULT: " + result);
                } else {
                    System.out.println("ERROR: DIVIDED BY 0 IS WRONG.");
                }
                break;
            default:
                System.out.println("OPPS SOMETHING WENT WRONG. PLEASE CHOOSE THE CORRECT OPTION");
        }

        scanner.close();
    }
}