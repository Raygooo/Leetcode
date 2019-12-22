package SelfLearn.MyQuestionSet;

import java.util.*;

/**
 * Class SwapBetweenArrayListAndArray is created on 2019/12/22 22:36.
 *
 * @author Ray
 * @version 2019/12/22
 **/

//这之间的转换仅限于对象(Object)之间，因为没有支持基本类型的列表(list)
    //如果需要和基本类型数组来转换，那么只能用循环或者Stream
public class SwapBetweenArrayListAndArray {
    public static void main(String[] args) {

    }

    public void ArrayToList() {


        Integer[] array = {1, 2, 3, 4, 5};
//        int[] arrayInt = {1,2,3,4}; 这种转换仅限于包装类，想转换成基本类型数组那只能一个一个来或者用Stream
        List<Integer> list2 = new ArrayList<>(Arrays.asList(array));

        /*
         * asList()返回的列表大小是固定的。
         * 事实上，返回的列表并不是Java,util.ArrayList，而是定义在Arrays中的一个*私有*的静态类
         * ArrayList本质上的实现是一个数组，
         * 而asList()返回的列表是有原始数组支持的固定大小的列表；
         * 它也继承了AbstractList类（实现了List接口）；
         * 它不支持添加和删除表中的元素
         */
        List<Integer> list3 = Arrays.asList(array);
        list3.add(1);//UnsupportedOperationException

        List<Integer> list4 = new ArrayList<>(array.length);
        Collections.addAll(list4, array);
    }

    public void ListToArray() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        int size = list.size();
        Integer[] array = list.toArray(new Integer[size]);
    }


}
