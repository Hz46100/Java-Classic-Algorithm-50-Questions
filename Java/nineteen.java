package Java;
public class nineteen {
    /**
     * 打印出如下图案（菱形）
        *
       ***
      *****
     *******
      *****
       ***
        */
    public static void main(String[] args) {
        // 上半部份
        for (int i = 0; i < 8 / 2; i++) {
            for (int j = 0; j < 8 / 2 - i; j++) {
                System.out.print(' ');
            }
            for (int k = 1; k < (i + 1) * 2; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
        // 下半部分
        for (int i = 1; i <= 8 / 2; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 8 - 2 * i - 1; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}