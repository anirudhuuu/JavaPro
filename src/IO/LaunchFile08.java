package IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    private int id;
    private String name;
    transient private int age;

    public Student(int id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void disp() {
        System.out.println("id:" + id + " name:" + name + " age:" + age);
    }
}

public class LaunchFile08 {
    static void main() {
        Student student1 = new Student(1, "Anirudh", 25);

        student1.disp();

        try {
            FileOutputStream fos = new FileOutputStream("java.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(student1);

            oos.close();
            fos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
