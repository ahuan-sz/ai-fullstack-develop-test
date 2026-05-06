package cn.codemao;

public class OopTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "小白";
        d.weight = 5.5;
        d.color = "白色";
        System.out.println("狗：" + d.name + "，年龄：" + d.getAge() + "，体重：" + d.weight + "，颜色：" + d.color);

        d.eat();
        d.setAge(35);
    }
}
