package Java;
public class seleven {
    /**
     * 题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
     */
    public static void main(String[] args) {
        int count = 0;
        for (int a = 1; a < 5; a++) {
            for (int b = 1; b < 5; b++) {
                for (int c = 1; c < 5; c++) {
                    for (int d = 1; d < 5; d++) {
                        if (a != b && a != c && a != d && b != c && b != d && c != d) {
                            count++;
                            System.out.println(a * 100 + b * 10 + c + " ");
                            if (count % 4 == 0) {
                                System.out.println();
                            }
                        }
                    }
                }
            }
        }
        System.out.print("共有" + count + "个三位数");
    }
}