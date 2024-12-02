import java.io.*;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name (with extension):");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Read File");
            System.out.println("2. Write to File");
            System.out.println("3. Append to File");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    readFile(file);
                    break;
                case 2:
                    System.out.println("Enter content to write to the file:");
                    String writeContent = scanner.nextLine();
                    writeFile(file, writeContent);
                    break;
                case 3:
                    System.out.println("Enter content to append to the file:");
                    String appendContent = scanner.nextLine();
                    appendToFile(file, appendContent);
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void readFile(File file) {
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("\nFile Content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    public static void writeFile(File file, String content) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(content);
            System.out.println("Content written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    public static void appendToFile(File file, String content) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(content);
            bw.newLine();
            System.out.println("Content appended to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file: " + e.getMessage());
        }
    }
}
