public class RubberDuck extends Duck {

    public RubberDuck() {
        super.quackBehaviour = new QuackWithSqueek();
        super.flyBehaviour = new FlyNoWay();
    }

    public void display() {

    }

    public void speccialSkills() {}
}
