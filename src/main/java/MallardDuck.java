public class MallardDuck extends Duck {

    public MallardDuck(){
        super.quackBehaviour = new QuackWithQuack();
        super.flyBehaviour = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a Mallard Duck");
    }

}
