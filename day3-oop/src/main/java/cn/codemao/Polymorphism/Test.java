package cn.codemao.Polymorphism;

public class Test {
    public static void main(String[] args) {
        // 创建一个学生的对象
        Student stu = new Student("张三", "zhangsan", "123456");

        // 创建学生管理系统的对象
        StudentManager sm = new StudentManager();
        // 把stu注册到学生管理系统当中
        sm.register(stu);

        // 创建一个老师对象
        Teacher tea = new Teacher("张三", "zhangsan", "123456");
        sm.register(tea);

        // 创建一个管理员对象
        Admin adm = new Admin("张三", "zhangsan", "123456");
        sm.register(adm);
    }
}
