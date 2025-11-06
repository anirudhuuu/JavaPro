package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LaunchFile06 {
    static void main() throws IOException {
        String filePath = "java.txt";
        FileReader reader = null;
        BufferedReader bufferedReader = null;

        try {
            // read from a file
            File file1 = new File(filePath);

            reader = new FileReader(file1);
            bufferedReader = new BufferedReader(reader);

            String str = bufferedReader.readLine();
            while(str!=null){
                System.out.println(str);
                str = bufferedReader.readLine();
            }

            file1.delete();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            bufferedReader.close();
        }
    }
}
