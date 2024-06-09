// Implement a Java program that reads a file path from the command line argument and attempts to read the contents of the file. If the file path is null or points to a non-existent file, throw a custom FileNotFoundException. If the file exists but cannot be read due to permission issues, throw a custom FileReadPermissionException. Your task is to create these custom exception classes and handle them appropriately in your program.
import java.io.*;
public class Q4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a file path as a command line argument.");
            return;
        }
        String filePath = args[0];
        try { readFile(filePath);} 
        catch (MyFileNotFoundException e) {System.out.println("Error: " + e.getMessage());} 
        catch (FileReadPermissionException e) {System.out.println("Error: " + e.getMessage());} 
        catch (IOException e) {System.out.println("An IO exception occurred: " + e.getMessage());}
    }
    private static void readFile(String filePath) throws MyFileNotFoundException, FileReadPermissionException, IOException {
        File file = new File(filePath);
        if (!file.exists()) throw new MyFileNotFoundException("File does not exist: " + filePath);
        if (!file.canRead()) throw new FileReadPermissionException("Do not have permission to read the file: " + filePath);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) System.out.println(line);
        }
    }
}
class MyFileNotFoundException extends Exception {
    public MyFileNotFoundException(String message) {super(message);}
}
class FileReadPermissionException extends Exception {
    public FileReadPermissionException(String message) {super(message);}
}