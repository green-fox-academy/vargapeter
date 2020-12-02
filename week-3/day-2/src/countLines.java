import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class countLines {
    public static void main(String[] args) {

        System.out.println(countLines("my-files.txt"));

    }

    public static int countLines(String filName) {

        Path path = Paths.get("my-file.txt");

        int lines = 0;
        try {

            lines = (int) Files.lines(path).count();

        } catch (IOException e) {
            System.out.println("0");
        }

        return lines;
    }

}