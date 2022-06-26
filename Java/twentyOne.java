package Java;
public class twentyOne {
    /**
     * 题目：求1+2!+3!+...+20!的和 
     *  !是阶乘运算符。
     */
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        for (int i = 1; i <= 20; i++) {
            b = b * i;
            a += b;
        }
        System.out.println(a);

    }
}