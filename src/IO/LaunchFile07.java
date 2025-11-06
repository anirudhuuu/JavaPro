package IO;

import java.io.*;

public class LaunchFile07 {
    static void main() throws IOException {
        String filePath = "java.txt";
        FileWriter writer = null;
        PrintWriter printWriter = null;

        try {
            // read from a file
            File file1 = new File(filePath);

            writer = new FileWriter(file1);
            printWriter = new PrintWriter(writer);

            printWriter.write(65);
            printWriter.write("\n");

            printWriter.println("JAVA");
            printWriter.println('A');
            printWriter.println(true);
            printWriter.println(44.5);

            file1.delete();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            printWriter.close();
        }
    }
}
