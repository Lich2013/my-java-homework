package exam;

import java.util.Scanner;

/**
 * Created by lzy on 2015/6/15.
 */
public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入长方形的长:");
        try {
            length = input.nextDouble();
        }
        catch (Exception e) {
            System.out.println("输入有误!");
            System.exit(0);
        }
        System.out.println("请输入长方形的宽:");
        try {
            width = input.nextDouble();
        }
        catch (Exception e) {
            System.out.println("输入有误!");
            System.exit(0);
        }
        System.out.println(getArea());
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
       return width * length;
    }
}
