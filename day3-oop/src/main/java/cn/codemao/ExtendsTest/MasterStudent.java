package cn.codemao.ExtendsTest;

public class MasterStudent extends Student {
    public MasterStudent() {
    }

    public MasterStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    public void study() {
        System.out.println("硕士研究生同学正在攻读硕士内容");
    }
}
