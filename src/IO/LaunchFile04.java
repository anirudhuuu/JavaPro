package IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LaunchFile04 {
    static void main() throws IOException {
        String filePath = "java.txt";
        FileReader reader = null;

        try {
            // read from a file
            File file1 = new File(filePath);
            reader = new FileReader(file1);

            // reads data char by char
            int i = reader.read();
            while (i != -1) {
                System.out.print((char) i);
                i = reader.read();
            }

            file1.delete();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            reader.close();
        }
    }
}
