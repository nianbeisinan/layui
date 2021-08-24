package spring06zuoye01;

// 人 是 我们的主体  ，主要的类 ，他需要依赖 手机
public class Person {
    public Person() {
        System.out.println("人在容器中诞生了");
    }
    //接口都是抽象的
    private Eat eat;

    public Eat getEat() {
        return eat;
    }

    public void setEat(Eat eat) {
        this.eat = eat;
    }

    public void personeat() {
        System.out.println("人要吃东西");
        eat.eat();
    }
}
