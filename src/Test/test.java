package Test;

/**
 * Class Test.test is created on 2019/12/3 9:58.
 *
 * @author Ray
 * @version 2019/12/3
 **/

public class Test {
    private Callback mCallback;

    Test(Callback callback) {
        mCallback = callback;
        mCallback.call(1);
    }

    public static void main(String[] args) {
        Test test = new Test(new Callback() {
            @Override
            public void call(int i) {
                if (i == 1) {

                } else {
                    System.out.println();

                }
            }
        });
    }

    public void some() {

    }

    interface Callback {
        void call(int i);
    }


}
