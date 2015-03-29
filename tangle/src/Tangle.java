/**
 * Created by lzy on 2015/3/24.
 */
import java.util.Scanner;
import java.lang.String;
public class Tangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入层数:");
        String num = input.nextLine();
        int level = 0;
        try {
            level = Integer.valueOf(num);
        }catch (Exception e){
            System.out.println("输入数据异常");
            return;
        }
        while (!(level<=33&&level>0)){
            if(level == 1){
                System.out.print("1");
                return;
            }
            System.out.println("不能大于33层或小于0!");
            System.out.println("请输入层数:");
            num = input.nextLine();
            try {
                level = Integer.valueOf(num);
            }catch (Exception e){
                System.out.println("输入数据异常");
            }
        }
        int i;
        int yh[] = new int[level];
        for(i = 0; i < level; i++) {
            yh[i] = 1;

            for(int j = i - 1 ; j > 0; j--) {
                yh[j] = yh[j - 1] + yh[j];
            }

            for (int k = i; k < level; k++)
                System.out.print("  ");

            for(int j=0;j<=i;j++)
                System.out.print(yh[j]+"  ");

                System.out.println();
        }
    }
}
