package cn.codemao.ExtendsTest;

public class MajorTeacher extends Teacher {
    public MajorTeacher() {
    }
    public MajorTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }
    public void teach() {
        System.out.println("专业课老师正在教专业知识");
    }
}
