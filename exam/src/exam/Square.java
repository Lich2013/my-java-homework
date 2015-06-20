package exam;

import java.util.Scanner;

/**
 * Created by lzy on 2015/6/15.
 */
public class Square extends Rectangle {

    public Square() {
        System.out.println("请输入正方形的边长:");
        Scanner input = new Scanner(System.in);
        try {
            length = input.nextDouble();
            width = length;
        }
        catch (Exception e) {
            System.out.println("输入有误!");
            System.exit(0);
        }
        System.out.println(getArea());
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
}
