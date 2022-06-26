package Java;
import java.util.*;

/** 题目：输入某年某月某日，判断这一天是这一年的第几天？ */
public class fourteen {
    public static void main(String[] args) {
        int year, day, month;
        int days = 0;
        int d = 0;
        fourteen fymd = new fourteen();
        System.out.print("输入xx年:");
        year = fymd.input();
        System.out.print("输入xx月:");
        month = fymd.input();
        System.out.print("输入xx天:");
        day = fymd.input();
        if (month > 12 || month < 0 || day > 31 || day < 0 || year < 0) {
            System.out.println("错误的输入格式");
            System.exit(0);
        }
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 2:
                    if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
                        /**
                         * 地球绕太阳一圈，实际上花365.24219天，但公历一年只有365天，所以一年就少算了0.24219天。
                         * 400年下来，少的日子就很可观了，有（0.24219*400＝96.876天），约97天，这些得补上。
                         * 一个简单的法子就是每4年规定为闰年，闰年要补一天，这样子400年就补了100天，但多补了3天。
                         * 怎么办？简单，随便废掉3个闰年就行了。为了方便，就找上了整百的年份，每400年有4个整百年份，
                         * 除了能被400整除的那年定为闰年，其他3个整百年都是平年，这纯粹是人为规定。 year%4==0&&year%100!=0
                         * 就是能被4整除的非整百年，是闰年。 year%400==0 就是能被400整除的整百年，是闰年。 year%100==0 && year%400!=0
                         * 就是另三个整百年，不是闰年。
                         * 所以year%4==0不是判断闰年的完整规则，记得每400年要干掉3个特例！正确的规则是上述第一种情况和第二种情况的总和。
                         */
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
            }
            d += days;
        }
        System.out.println("第" + year + "的" + month + "的" + day + "" + (d + day) + "天");
    }
// public 全局可调用
    public int input() {
        int value = 0;
        Scanner s = new Scanner(System.in);
        value = s.nextInt();
        return value;
    }

}