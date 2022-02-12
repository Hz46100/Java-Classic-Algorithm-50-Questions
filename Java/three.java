package Java;
/**
 * 题：3
 * 打印出所有的"水仙花数(narcissus number)"，所谓"水仙花数"是指一个三位数，
 * 其各位数字立方和等于该数本身。例如：153是一个"水仙花数"， 因为153=1的三次方＋5的三次方＋3的三次方。
 * Question: 3
 * Print out all "narcissus numbers", where the so-called "narcissus
 * number" is a three-digit number whose sum of cubes is equal to the number
 * itself. For example: 153 is a "daffodil number", because 153=1 cubed + 5 cubed + 3 cubed.
 */
public class three {
    public static void main(String[] args) {
        // ；for语句来loop i这个数确定范围100-999
        for (int i = 100; i < 1000; i++) {
            // 取 个 十 百 位数
            int a = i / 100 % 10;
            int j = i / 10 % 10;
            int k = i % 10;
            // 用if语句来判断该数是不是水仙花数
            // 用Math.pow来确定是 个 十 百 位数的3次方
            if (Math.pow(a, 3) + Math.pow(j, 3) + Math.pow(k, 3) == i) {
                System.out.println(i);
            }
        }
    }
}