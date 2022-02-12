package Java;
/*题：1
   题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * Question: 1 Topic: Classical problem: There is a pair of rabbits. From the
 * 3rd month after birth, a pair of rabbits is born every month. After the
 * little rabbit grows to the third month, another pair of rabbits is born every
 * month. If the rabbits are not dead, ask What is the total number of rabbits
 * per month?
 */
public class one {
    public static final int MONTH = 15;

    public static void main(String[] args) {
        long f1 = 1L, f2 = 1L;
        long f;
        for (int i = 3; i < MONTH; i++) {
            f = f2;
            f2 = f1 + f2;
            f1 = f;
            System.out.print("第" + i + "个月的兔子对数: ");
            System.out.println(" " + f2);
        }
    }
}