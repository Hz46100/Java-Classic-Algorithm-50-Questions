package Java;

import java.util.*;

public class two {
    public static void main(String[] args) {
        /**
         * 题：2 判断101-200之间有多少个素数，并输出所有素数
         *
         * /** Question: 2 Determine how many prime numbers there are between 101-200,
         * and output all prime numbers.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int i = sc.nextInt();
        sc.close();
        if (100 < i && i < 201) {
            System.out.println(i);
        } else {
            System.out.println("请输入正确的数字");
        }
        for (int j = 2; j < Math.sqrt(i); j++) {

            if (i % j == 0) {
                System.out.println(i + "该数是素数");
            } else {
                System.out.println(j + "该数不是素数");
            }

        }

    }
}
