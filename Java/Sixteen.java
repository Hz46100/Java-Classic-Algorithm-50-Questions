package Java;
public class Sixteen {
    //题目：输出9*9口诀。
        public static void main(String[] args) {
        for(int i=0;i<10;i++){
            for(int j=0;j<i;j++){
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }
}