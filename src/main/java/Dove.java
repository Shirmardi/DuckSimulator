public class Dove implements Bird {

    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    public Dove(){}

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void flyBehavior(){
        flyBehaviour.fly();
    }

    public void display() {
        System.out.println("I am a Dove");
    }
}
