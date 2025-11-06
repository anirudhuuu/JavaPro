package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchFile03 {
    static void main() throws IOException {
        String filePath = "java.txt";
        FileWriter writer = null;

        try {
            // write into a file
            File file1 = new File(filePath);

            writer = new FileWriter(file1);
            writer.write("Java");
            writer.write(65);

            char[] ch =  {'a', 'n', 'i'};
            writer.write(ch);

            file1.delete();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            writer.close();
        }
    }
}
