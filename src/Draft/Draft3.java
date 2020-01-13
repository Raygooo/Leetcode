package Draft;

/**
 * Class Draft1 is created on 2019/12/23 13:22.
 *
 * @author Ray
 * @version 2019/12/23
 **/

public class Draft3 {
    public static void main(String[] args) {
        String Str = new String("菜鸟教程:www.runoob.com");
        String SubStr1 = new String("runoob");
        String SubStr2 = new String("com");

//        System.out.print("查找字符 o 最后出现的位置 :" );
//        System.out.println(Str.lastIndexOf( 'o' ));
//        System.out.print("从第14个位置查找字符 o 最后出现的位置 :" );
//        System.out.println(Str.lastIndexOf( 'o', 14 ));
        System.out.print("子字符串 SubStr1 最后出现的位置:" );
        System.out.println( Str.lastIndexOf( SubStr1 ));
        System.out.print("从第十五个位置开始搜索子字符串 SubStr1最后出现的位置 :" );
        System.out.println( Str.lastIndexOf( SubStr1, 9 ));
//        System.out.print("子字符串 SubStr2 最后出现的位置 :" );
//        System.out.println(Str.lastIndexOf( SubStr2 ));
    }

}
