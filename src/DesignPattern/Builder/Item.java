package DesignPattern.Builder;

/**
 * Class Item is created on 2019/12/12 23:35.
 *
 * @author Ray
 * @version 2019/12/12
 **/

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
