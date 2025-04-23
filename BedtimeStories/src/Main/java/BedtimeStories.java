import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Choose a story to read:");
        System.out.println("1. Goldilocks");
        System.out.println("2. Hansel and Gretel");
        System.out.println("3. Mary Had a Little Lamb");
        System.out.print("> ");

        String input = inputScanner.nextLine().trim().toLowerCase();

        String filename;

        switch (input) {
            case "1":
                filename = "src/Goldilocks.txt";
                break;
            case "2":
                filename = "src/HanselAndGretel.txt";
                break;
            case "3":
                filename = "src/MaryHadALittleLamb.txt";
                break;
            default:
                System.out.println("Invalid selection. Please restart the program and choose 1, 2, or 3.");
                return;
        }

        File file = new File(filename);

        try {
            Scanner fileScanner = new Scanner(file);
            int lineNumber = 1;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, the file '" + filename + "' was not found.");
        }
    }
}
