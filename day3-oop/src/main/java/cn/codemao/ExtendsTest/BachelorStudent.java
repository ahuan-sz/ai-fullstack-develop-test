package cn.codemao.ExtendsTest;

public class BachelorStudent extends Student {
    public BachelorStudent() {
    }

    public BachelorStudent(String name, int age, String subject) {
        super(name, age, subject);
    }

    public void study() {
        System.out.println("本科同学正在攻读本科内容");
    }
}
