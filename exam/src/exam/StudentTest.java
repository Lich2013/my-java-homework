package exam;

import java.util.Arrays;
public class StudentTest {
    public static void main(String[] args) {
        int i;
        Student ps[] = new Student[6];
        ps[0] = new Student("张三", 170, 110);
        ps[1] = new Student("李四", 168, 120);
        ps[2] = new Student("王五", 165, 115);
        ps[3] = new Student("赵六", 172, 121);
        ps[4] = new Student("周七", 160, 100);
        ps[5] = new Student("郑八", 166, 119);
        System.out.println("排序前数组元素的序列是：");
        for (i = 0; i < ps.length; i++) {
            ps[i].speak();
        }
        Arrays.sort(ps);//调用Java系统类中的排序方法对ps数组排序
        System.out.println("\n排序后数组元素的序列是：");
        for (i = 0; i < ps.length; i++) {
            System.out.println(ps[i]);
        }
    }
}

