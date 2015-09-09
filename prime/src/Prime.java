import java.util.ArrayList;
import java.util.Scanner;
/**
 * 用于获取范围素数
 * @Author Lich
 * @param int start 开始位置
 * @param int end   结束位置
 * @param ArrayList<Integer> arrlist 保存范围内素数
 * @param ArrayList<Integer> before_list 保存开始位置之前的素数
 */
public class Prime {
    public static void main(String[] args) {
        int start, end;
        ArrayList<Integer> arrlist;
        System.out.println("请输入开始位置:");
        Scanner input = new Scanner(System.in);
        start = input.nextInt();
        System.out.println("请输入结束位置:");
        end = input.nextInt();
        if (start <= 0 || end <= 0) {
            System.out.println("输入数据有误!");
            return;
        }
        arrlist = getPrime(start, end);
        for(Object prime : arrlist) {
            System.out.print(prime + " ");
        }
    }
    //获取范围内素数
    private static ArrayList getPrime(int start, int end) {
        ArrayList<Integer> before_arrlist = new ArrayList<Integer>();
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        for(int i = 1; i <= start; i++) {
            if(judgePrime(i, before_arrlist)) {
                before_arrlist.add(i);
            }
        }
        for(int j = start; j <= end; j++) {
            if(judgePrime(j, before_arrlist)) {
                before_arrlist.add(j);
                arrlist.add(j);
            }
        }
        return arrlist;
    }
    //判断是否为素数
    private static boolean judgePrime(int num, ArrayList<Integer> before_arrlist) {
        if(num == 1 || num == 2) {
            return true;
        }
        for(int prime : before_arrlist) {
            if(prime == 1)
                continue;
            if(prime == num)
                continue;
            if(num % prime == 0) {
                return false;
            }
        }
        return true;
    }
}
