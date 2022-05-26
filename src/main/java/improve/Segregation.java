package improve;

public class Segregation {
    public static void main(String[] args) {
        A a = new A();
        a.do1(new C());
        a.do2(new C());
    }
}

interface Interface1{
    void operation1();
}

interface Interface2{
    void operation2();
    void operation3();
}

interface Interface3{
    void operation4();
    void operation5();
}

class C implements Interface1, Interface2{

    @Override
    public void operation1() {
        System.out.println("B实现方法operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B实现方法operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B实现方法operation3");
    }
}

class D implements Interface1, Interface3{

    @Override
    public void operation1() {
        System.out.println("B实现方法operation1");
    }

    @Override
    public void operation4() {
        System.out.println("B实现方法operation1");
    }

    @Override
    public void operation5() {
        System.out.println("B实现方法operation1");
    }
}

class A{
    public void do1(Interface1 interface1){
        interface1.operation1();
    }

    public void do2(Interface2 interface2){
        interface2.operation2();
        interface2.operation3();
    }
}