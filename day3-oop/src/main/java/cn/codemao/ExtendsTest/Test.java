package cn.codemao.ExtendsTest;

public class Test {
    public static void main(String[] args) {
        BachelorStudent bs = new BachelorStudent("张三", 18, "大一");
        System.out.println("姓名：" + bs.getName() + "，年龄：" + bs.getAge() + "，年级：" + bs.getGrade());
        bs.study();

        MasterStudent ms = new MasterStudent("李四", 19, "大二");
        System.out.println("姓名：" + ms.getName() + "，年龄：" + ms.getAge() + "，年级：" + ms.getGrade());
        ms.study();

        GeneralTeacher gt = new GeneralTeacher("王五", 38, "语文");
        System.out.println("姓名：" + gt.getName() + "，年龄：" + gt.getAge() + "，科目：" + gt.getSubject());
        gt.teach();

        MajorTeacher mt = new MajorTeacher("赵六", 35, "数学");
        System.out.println("姓名：" + mt.getName() + "，年龄：" + mt.getAge() + "，科目：" + mt.getSubject());
        mt.teach();
    }
}
