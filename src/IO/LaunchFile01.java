package IO;

import java.io.File;

public class LaunchFile01 {
    static void main() {
        try {
            // operations on a file
            File file1 = new File("java.txt");
            System.out.println(file1.exists());
            System.out.println(file1.createNewFile());
            System.out.println(file1.exists());
            file1.delete();

            // operations on a folder/directory
            File dir1 = new File("dir1");
            System.out.println(dir1.exists());
            dir1.mkdir();
            dir1.delete();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
