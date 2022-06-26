package Java;
import java.text.DecimalFormat;

public class twenty {
    /**
     * 题目： 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
     */
    public static void main(String[] args) {
        int molecular = 2; // 分子
        int denominator = 1; // 分母
        int t;
        double sum = 0;
        // 格式化
        DecimalFormat df = new DecimalFormat("#0.0000");
        for (int i = 1; i <= 20; i++) {
            sum += (double) molecular / denominator;
            t = denominator;
            denominator = molecular;
            molecular = denominator + t;
            if (i==20) {
                System.out.println("数列的前20项之和为:"+df.format(sum));
            }
        }
    }
}