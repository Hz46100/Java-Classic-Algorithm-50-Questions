package Java;
/**：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？*/
public class thirteen {
    public static void main(String[] args) {
        for (long i = 1L; i < 100000; i++) {
            if (Math.sqrt((long) (i + 100)) % 1 == 0) {
                if (Math.sqrt((long) (i + 268)) % 1 == 0) {
                    System.out.println(i + "加100是完全平方数，加168又是完全平方数");
                }
            }
        }
    }
}