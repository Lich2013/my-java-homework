package Complex;

import java.util.Scanner;

/**
 * 复数类
 * 2015-4-8 00:02:46
 * @Author Lich
 */
public class Complex implements ComplexComparable {
    private double real;
    private double imaginary;
    //构造函数
    public Complex () {
        this.real = 0;
        this.imaginary = 0;
    }
    public Complex (int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex (float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex (double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    //取得模值
    public double modulus (Complex complex) {
        double result;
        result = Math.sqrt(Math.pow(complex.real, 2) + Math.pow(complex.imaginary, 2));
        return result;
    }
    //比较模值
    public static Complex compareModulus(Complex first, Complex second) {
        Complex result;
        double f, s;
        f = first.modulus(first);
        s = second.modulus(second);
        if (f > s)
            result = first;
        else
            result = second;
        return result;
    }
    //加法
    private static Complex add (Complex first, Complex second) {
        Complex result = new Complex();
        result.real = first.real + second.real;
        result.imaginary = first.imaginary + second.imaginary;
        return result;
    }
    //减法
    private static Complex take (Complex first, Complex second) {
        Complex result = new Complex();
        result.real = first.real - second.real;
        result.imaginary = first.imaginary - second.imaginary;
        return result;
    }
    //比较
    private static Complex compare (Complex first, Complex second) {
        if (first.real > second.real)
            return first;
        else if (first.real == second.real) {
            if (first.imaginary > second.imaginary)
                return first;
            else if (first.imaginary == second.imaginary)
                return first;
            else
                return second;
        }
        else
            return second;
    }
    public static void main (String[] args) {
        int select = 0;
        double first_real = 0, first_imaginary = 0, second_real = 0, second_imaginary = 0;
        Complex result = new Complex();
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("输入第一个复数的实部和虚部:");
            first_real = input.nextDouble();
            first_imaginary = input.nextDouble();
            System.out.println("输入第二个复数的实部和虚部:");
            second_real = input.nextDouble();
            second_imaginary = input.nextDouble();
        }
        catch (Exception e) {
            System.out.println("输入错误");
            System.exit(0);
        }
        Complex first = new Complex(first_real, first_imaginary);
        Complex second = new Complex(second_real, second_imaginary);
        System.out.println("输入要执行的操作:");
        System.out.println("1.加法; 2.减法; 3.比较大小; 4.描述这两个复数; 5.比较这两个数模的大小");
        try {
             select = input.nextInt();
        }
        catch (Exception e){
            System.out.println("输入错误!");
            System.exit(0);
        }
        switch (select) {
            case 1:
                result = add(first, second);
                break;
            case 2:
                result = take(first, second);
                break;
            case 3:
                result = compare(first, second);
                if (result.imaginary >= 0)
                    System.out.println(result.real+"+"+result.imaginary+"i比较大");
                else {
                    System.out.print(result.real);
                    System.out.print(result.imaginary + "i比较大");
                }
                return;
            case 4:
                System.out.println("第一个复数实部为"+first.real+", 虚部为"+first.imaginary);
                System.out.println("第二个复数实部为"+second.real+", 虚部为"+second.imaginary);
                return;
            case 5:
                result = compareModulus(first, second);
                System.out.println(result.real+"+"+result.imaginary+"i"+"的模较大");
                return;
            default:
                System.out.println("未知错误!");
                return;
        }
        if (result.imaginary >= 0)
            System.out.println(result.real+"+"+result.imaginary+"i");
        else {
            System.out.print(result.real);
            System.out.print(result.imaginary + "i");
        }
    }
}