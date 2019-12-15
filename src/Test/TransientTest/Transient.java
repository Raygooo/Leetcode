package Test.TransientTest;

import java.io.*;

/**
 * Class Transient is created on 2019/12/15 13:34.
 *
 * @author Ray
 * @version 2019/12/15
 **/

public class Transient implements Serializable {
    private static final long serialVersionUID = 233858934995755239L;
    private String name1;
    private transient String name2;
    private int num1;
    private transient int num2;

    public Transient(String name1, String name2, int num1, int num2) {
        this.name1 = name1;
        this.name2 = name2;
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Transient{" +
                "name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                ", num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }

    public static void testTransient() {
        String name1 = "常规属性", name2 = "transient修饰的属性";
        int num1 = 1, num2 = 2;
        Transient Transient = new Transient(name1, name2, num1, num2);
        System.out.println(
                "序列化之前： " + Transient.toString()
        );
        ObjectOutputStream outputStream;
        ObjectInputStream inputStream;
        String filepath = "C:\\Users\\Ray\\iCloudDrive\\Documents\\Programing\\Java\\Leetcode\\src\\Test\\TransientTest\\Transient.obj";
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(filepath));
            outputStream.writeObject(Transient);

            inputStream = new ObjectInputStream(new FileInputStream(filepath));
            Transient readObject = (Transient) inputStream.readObject();
            System.out.println("序列化后： " + readObject.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testTransient();
    }
}
