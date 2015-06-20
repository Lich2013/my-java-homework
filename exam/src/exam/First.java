package exam;

import java.util.Scanner;

/**
 * Created by lzy on 2015/6/15.
 */
public class First {
    public static void main(String[] args) {
        String max;
        String min;

        Scanner input = new Scanner(System.in);
        String[] arr = new String[10];

        System.out.println("请输入10个字符串, 用空格隔开:");
        try {
            for (int i = 0; i < 10; i++) {
                arr[i] = input.next();
            }
        }
        catch (Exception e) {
            System.out.println("输入有误!");
            System.exit(0);
        }

        max = arr[0];
        min = arr[0];
        for (int j = 1; j < 10; j++) {
            if (max.compareTo(arr[j])<0) {
                max = arr[j];
            }
            if (min.compareTo(arr[j])>0) {
                min = arr[j];
            }
        }

        System.out.println("最大的字符串为" + max + ", 最小的字符串为" + min);
    }
}
