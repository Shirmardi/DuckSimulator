public class Pigeon extends Dove {

    public Pigeon (){
        super.quackBehaviour = new QuackWithCoo();
        super.flyBehaviour = new FlyWithWings();
    }

    public void display(){
        System.out.println("I am a Pigeon");
    }

}
