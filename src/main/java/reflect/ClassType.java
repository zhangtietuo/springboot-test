package reflect;

/**
 * @Author:zhangtietuo
 * @Description:
 * @Date: 2018/3/7 15:57
 */
public class ClassType {

    public static void main(String[] args) {
        String a1 = "1";
        String a2 = "2";
        System.out.println(a1.getClass() == a2.getClass());
        System.out.println(a1 == a2);

    }
}
