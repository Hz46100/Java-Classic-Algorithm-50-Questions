package Java;
import java.util.Scanner;

public class five {
    /** 题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。 */
    static int grade;

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int i = str.nextInt();
        str.close();
        five fc = new five();
        grade = fc.compare(i);
        if (grade == 1) {
            System.out.print('A');
        } else if (grade == 2) {
            System.out.print('B');
        } else {
            System.out.print('C');
        }
    }

    public int compare(int i) {
        return 90 <= i ? 1 : 60 <= i ? 2 : 3;
    }

}
