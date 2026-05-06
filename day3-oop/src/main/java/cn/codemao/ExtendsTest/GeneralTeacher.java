package cn.codemao.ExtendsTest;

public class GeneralTeacher extends Teacher {
    public GeneralTeacher() {
    }
    public GeneralTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }
    public void teach() {
        System.out.println("通识课老师正在教通识");
    }
}
