package Java;
public class ten {
    /**
     * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下， 求它在 第10次落地时，共经过多少米？第10次反弹多高？
     */
    static double jli = 100;
    static double height = 100;

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            jli = jli + height;
            height = height / 2;
        }
        System.out.println("距离:" + jli);
        System.out.println("高度" + height);
    }
}