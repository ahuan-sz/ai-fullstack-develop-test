package cn.codemao.Polymorphism;

public class Teacher extends  Person {
    public Teacher() {
        super();
    }

    public Teacher(String name, String username, String password) {
        super(name, username, password);
    }

    @Override
    public void work() {
        System.out.println("老师的工作是教书");
    }
}
