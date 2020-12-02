import java.io.BufferedReader;
import java.io.FileReader;


public class printEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each line from the file.
        // If the program is unable to read the file (for example it does not exist),
        // then it should print the following error message: "Unable to read file: my-file.txt"

        //        List<String> content = new ArrayList();
        //        content.add("First line of my file");

        // Required by Files.write(filePath, content)
        // Creates a new file if not exists and overwrites it's content
        // The elements of the content lists will become the lines of the file

        try (BufferedReader br = new BufferedReader(new FileReader("my-file.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}