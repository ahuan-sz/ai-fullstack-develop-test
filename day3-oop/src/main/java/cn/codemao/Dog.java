package cn.codemao;

public class Dog {
    String name;
    private int age;
    double weight;
    String color;

    public Dog() {
        System.out.println("空参构造方法");
    }

    public Dog(String name, double weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        System.out.println("有参构造方法");
    }

    public void eat() {
        System.out.println("狗在吃饭");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >=0 && age <= 20) {
            this.age = age;
            System.out.println("年龄合法");
        } else {
            System.out.println("年龄不合法");
        }
    }
}
