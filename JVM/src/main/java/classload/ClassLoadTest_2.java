package classload;

/**
 * 这种情况会输出子类的：this Children static
 *
 * 虽然main方法调用的是父类的静态变量：a
 * 但是子类也对静态变量赋值，所以子类也算主动使用。
 *
 * @Author bowen.cui
 * @Date 2020/2/14 22:57
 **/
public class ClassLoadTest_2 {

    public static void main(String[] args) {
        System.out.println(Children_2.b);
    }

}

class Parent_2 {

    //public static String a = "this parent";

    static {
        System.out.println("this Parent static");
    }
}

class Children_2 extends Parent_2 {

    public static String b = "this Children";

    static {
        System.out.println("this Children static");
    }
}