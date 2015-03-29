/**
 * 比较输入的两个数的大小
 */
import java.util.Scanner;
import java.lang.String;

public class Main {
    private double a;
    private double b;
    private String result;

    public static void main(String[] args) {
        input();
        getContinue();
    }

    //获取是否继续
    public static void getContinue(){
        System.out.println("是否结束?输入y/n");
        Scanner input = new Scanner(System.in);
        String goOn = input.nextLine();
        judgeFinish(goOn);
    }

    //判断结束
    public static void judgeFinish(String goOn){
        if (goOn.equals("y")||goOn.equals("Y")) {
            System.exit(0);
        }
        else if(goOn.equals("n")||goOn.equals("N")){
            input();
            getContinue();
        }
        else {
            System.out.println("输入错误!请重新输入!");
        }
    }

    //输入
    public static void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("输入两个数字:");
        String first = input.next();
        String second = input.next();
        Main main = new Main();
        System.out.println(main.compare(first, second));
    }

    //比较
    private String compare(String first, String second){
        try{
            this.a = Double.valueOf(first);
            this.b = Double.valueOf(second);
        }catch (Exception e){
            System.out.println("输入数字类型错误");
            System.exit(0);
        }
        if(this.a > this.b){
            this.result = first + "大于" + second;
        }
        else if(a == b) {
            this.result = first + "等于" + second;
        }
        else{
             this.result = first + "小于" + second;
        }
          return this.result;
    }
}
