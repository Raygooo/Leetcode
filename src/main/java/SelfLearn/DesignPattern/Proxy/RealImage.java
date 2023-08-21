package SelfLearn.DesignPattern.Proxy;

/**
 * Class RealImage is created on 2019/12/12 22:13.
 *
 * @author Ray
 * @version 2019/12/12
 **/

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    @Override
    public void display() {
        System.out.printf("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}
