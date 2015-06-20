package exam;

public class Student implements Comparable<Student> {
    private String name;
    private float height, weight;
    public Student(String name, float height, float weight) {
        super();
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void speak() {
        System.out.println("我是" + name + "，我的身高是" + height + "，我的体重是" + weight);
    }
    public int compareTo(Student o) {
        int flag;
        if(o.weight > weight)
            flag = 1;
        else
            flag = -1;
        return flag;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", height=" + height + ", weight="
                + weight + "]";
    }
}

