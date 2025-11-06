package IO;

import java.io.File;

public class LaunchFile02 {
    static void main() {
        try {
            // operations on a file
            File file1 = new File("java.txt");

            System.out.println(file1.exists());
            System.out.println(file1.getPath());
            System.out.println(file1.isDirectory());
            System.out.println(file1.isFile());

            file1.delete();

            // operations on a folder/directory
            File dir1 = new File("dir1");
            System.out.println(dir1.isDirectory());
            System.out.println(dir1.isFile());

            dir1.delete();

            File file2 = new File("/Users/anirudhjwala/IdeaProjects/JavaPro");
            String[] files = file2.list();
            for (String file : files) {
                System.out.println(file);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
