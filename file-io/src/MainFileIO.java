import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainFileIO {
    public static void main(String[] args) {
        try {
            // Don't forget to delete existing directory for avoid AlreadyExistException!
            Files.createDirectory(Paths.get("D:\\IDEA_projects\\more-and-more-java\\file-io\\src\\test-files"));
            Files.createFile(Paths.get("D:\\IDEA_projects\\more-and-more-java\\file-io\\src\\test-files\\test_test_test"));
        } catch (IOException e){
            System.out.println(e.toString());
        } finally {
            System.out.println("Hello, this is finally");
        }

        try {
            File file = new File("D:\\IDEA_projects\\more-and-more-java\\file-io\\src\\test-files\\test_test_test");
            PrintWriter pw = new PrintWriter(file);
            for (int i = 0; i < 10; i++) {
                pw.write("test" + i + "\n");
            }
            pw.close();

            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("Hello, this is finally x2");
        }
    }
}
