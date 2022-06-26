package Java;
public class eighteen {
    /**
     * 题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。
     * 已抽签决定比赛名单。有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出二队赛手的名单。
     */
    public static void main(String[] args) {
        char[] q = { 'a', 'b', 'c' };
        char[] w = { 'x', 'y', 'z' };
        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < w.length; j++) {
                if (q[i] == 'a' && w[j] == 'x') {
                    continue;
                } else if ((q[i] == 'c' && w[j] == 'x') || (q[i] == 'c' && w[j] == 'z')) {
                    continue;
                }
                System.out.println(q[i] + "\tVS\t" + w[j]);
            }
        }
    }
}