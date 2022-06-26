package Java;

import java.util.Scanner;

public class four {
    /** 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。 
     * Question:4
     * Factor a positive integer into prime factors. For example: input 90, print out 90=2*3*3*5.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int i = sc.nextInt();
        sc.close();
        for (int a = 0; a < 100; a++) {
            for (int s = 0; s < 100; s++) {
                for (int d = 0; d < 100; d++) {
                    for (int f = 0; f < 100; f++) {
                        if ((a * s * d * f) == i&&a<=2){
                            System.out.println(i + "=" + a + "*" + s + "*" + d + "*" + f);
                        }
                    }
                }
            }
        }
    }
}
