package Java;

import java.util.*;

public class seven {
    /** 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数 */
    static int blank = 0;// 空白
    static int number = 0;// 数字
    static int other = 0;// 其他
    static int character = 0;// 字符

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("请输入一行字符：");
        String s = s1.nextLine();
        char[] ch = null;
        ch = s.toCharArray();
        s1.close();
        for (int i = 0; i < ch.length; i++) { // 'a' a是输入的字符，类似于文本型这种。
            if (ch[i] >= '0' && ch[i] <= '9') { // 数字0~9
                number++;
            } else if (ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z') { // 大小写a~z
                character++;
            } else if (ch[i] == ' ') { // 空格字符
                blank++;
            } else { // 否则全部按其他类型算
                other++;
            }
        }
        System.out.println("空格字符个数：" + blank);
        System.out.println("数字字符个数：" + number);
        System.out.println("其他字符个数：" + other);
        System.out.println("英语字母个数：" + character);
    }
}