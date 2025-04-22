
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {
                "Ezra", "Elisha", "Ian",
                "Siddalee", "Pursalane", "Zephaniah"
        };

        selectKid(scanner, names);
        playGuessingGame(scanner);

        scanner.close();
    }

    private static void selectKid(Scanner scanner, String[] names) {
        try {
            System.out.print("Pick a kid (select #1 - #6): ");
            int index = scanner.nextInt();

            index--;
            if (index >= 0 && index < names.length) {
                System.out.println("You selected: " + names[index]);
            } else {
                System.out.println("Your number was out of range!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Not a valid number");
            scanner.nextLine();
        }
    }

    private static void playGuessingGame(Scanner scanner) {
        boolean success = false;
        int correctNumber = (int) (Math.random() * 10) + 1;

        while (!success) {
            try {
                System.out.print("Pick a number (between #1 - #10): ");
                int guessedNumber = scanner.nextInt();
                scanner.nextLine();

                if (guessedNumber < 1 || guessedNumber > 10) {
                    System.out.println("Number out of range. Pick between 1 and 10.");
                    continue;
                }

                if (guessedNumber != correctNumber) {
                    if (guessedNumber > correctNumber) {
                        System.out.println("It's too high.");
                    } else {
                        System.out.println("It's too low.");
                    }
                    System.out.println("Wrong, try again.");
                } else {
                    System.out.println("You guessed it correctly!");
                    success = true;
                }

            } catch (InputMismatchException e) {
                System.out.println("Not a valid number. Please enter digits only.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("⚠️ Something else went wrong: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}