package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LaunchFile09 {
    static void main() {
        try {
            FileInputStream fis = new FileInputStream("java.txt");
            BufferedInputStream  bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);

            Student student = (Student) ois.readObject();
            student.disp();

            ois.close();
            fis.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
