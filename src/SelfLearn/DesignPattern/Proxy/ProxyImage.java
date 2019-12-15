package SelfLearn.DesignPattern.Proxy;

/**
 * Class ProxyImage is created on 2019/12/12 22:15.
 *
 * @author Ray
 * @version 2019/12/12
 **/

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
