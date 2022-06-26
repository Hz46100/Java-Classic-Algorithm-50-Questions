package Java;
import java.util.*;
import java.text.DecimalFormat;   //Java 中格式化十进制数的最流行的方法之一。
public class twelve {
  /**
   * 题目：企业发放的奖金根据利润提成。 利润(I)低于或等于10万元时，奖金可提10%；
   * 利润高于10万元，低于20万元时，低于10万元的部分按10%提成,高于10万元的部分，可可提成7.5%；
   * 20万到40万之间时,高于20万元的部分，可提成5%； 40万到60万之间时高于40万元的部分，可提成3%；
   * 60万到100万之间时，高于60万元的部分，可提成1.5%， 高于100万元时，超过100万元的部分按1%提成， 从键盘输入当月利润I，求应发放奖金总数？
   */
  static double award = 0;
  static double profit = 0;

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    profit = s.nextInt();
    s.close();
    System.out.println("输入的利润是" + profit + "万");
    if (profit > 0 && profit < 10) {
      award = profit * 0.1;
    } else if (profit > 10 && profit <= 20) {
      award = 10 * 0.1 + (profit - 10) * 0.075;
    } else if (profit > 20 && profit <= 40) {
      award = 10 * 0.1 + 10 * 0.075 + (profit - 20) * 0.05;
    } else if (profit > 40 && profit <= 60) {
      award = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + (profit - 40) * 0.03;
    } else if (profit > 60 && profit <= 100) {
      award = 20 * 0.175 + 20 * 0.05 + 20 * 0.03 + (profit - 60) * 0.015;
    } else if (profit > 100) {
      award = 20 * 0.175 + 40 * 0.08 + 40 * 0.015 + (profit - 100) * 0.01;
    }
    DecimalFormat df=new DecimalFormat("#0.00000");
    System.out.println("应该提取的奖金是"+df.format(award)+"万");
  }
}