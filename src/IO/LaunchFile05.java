package IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchFile05 {
    static void main() throws IOException {
        String filePath = "java.txt";
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;

        try {
            // read from a file
            File file1 = new File(filePath);

            writer = new FileWriter(file1);
            bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("Hello World");
            bufferedWriter.newLine();
            bufferedWriter.write(66);
            bufferedWriter.newLine();
            bufferedWriter.write(97);
            bufferedWriter.newLine();

            char[] ch = {'a', 'n', 'i'};
            bufferedWriter.write(ch);

            file1.delete();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}
