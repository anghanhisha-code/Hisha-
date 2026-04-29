import java.io.*;
import java.util.Date;

public class FileOperations {

    // Method to display file properties
    public static void showProperties(File file) {
        if (file.exists()) {
            System.out.println("\n--- File Properties ---");
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("File Size: " + file.length() + " bytes");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Last Modified: " + new Date(file.lastModified()));
        } else {
            System.out.println("File does not exist.");
        }
    }

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Usage:");
            System.out.println("Copy: java FileOperations copy source.txt dest.txt");
            System.out.println("Delete: java FileOperations delete file.txt");
            System.out.println("Rename: java FileOperations rename old.txt new.txt");
            return;
        }

        String command = args[0];

        try {
            switch (command.toLowerCase()) {

                // COPY FILE
                case "copy":
                    if (args.length != 3) {
                        System.out.println("Invalid arguments for copy.");
                        return;
                    }

                    File src = new File(args[1]);
                    File dest = new File(args[2]);

                    if (!src.exists()) {
                        throw new FileNotFoundException("Source file not found.");
                    }

                    FileInputStream fis = new FileInputStream(src);
                    FileOutputStream fos = new FileOutputStream(dest);

                    int data;
                    while ((data = fis.read()) != -1) {
                        fos.write(data);
                    }

                    fis.close();
                    fos.close();

                    System.out.println("File copied successfully.");
                    showProperties(dest);
                    break;

                // DELETE FILE
                case "delete":
                    File fileToDelete = new File(args[1]);

                    if (fileToDelete.delete()) {
                        System.out.println("File deleted successfully.");
                    } else {
                        System.out.println("Failed to delete file.");
                    }
                    break;

                // RENAME FILE
                case "rename":
                    if (args.length != 3) {
                        System.out.println("Invalid arguments for rename.");
                        return;
                    }

                    File oldFile = new File(args[1]);
                    File newFile = new File(args[2]);

                    if (oldFile.renameTo(newFile)) {
                        System.out.println("File renamed successfully.");
                        showProperties(newFile);
                    } else {
                        System.out.println("Rename failed.");
                    }
                    break;

                default:
                    System.out.println("Invalid command.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}
