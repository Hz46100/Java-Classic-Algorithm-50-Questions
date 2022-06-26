package Java;
import java.util.*;

public class fifteen {
    /** 题目：输入三个整数x,y,z，请把这三个数由小到大输出。 */
    public static void main(String[] args) {
        fifteen s = new fifteen();
        int a, b, c;
        System.out.println("输入3个整数");
        a = s.input();
        b = s.input();
        c = s.input();
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            int t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            int t = b;
            b = c;
            c = t;
        }
        System.out.println( a + " " + b + " " + c);
    }

    public int input() {
        int value = 0;
        Scanner s = new Scanner(System.in);
        value = s.nextInt();
        return value;
    }
}