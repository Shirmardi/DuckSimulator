public class MiniDuckSimulator {

    public static void main (String args[]){

        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();

        Dove pij = new Pigeon();
        pij.performQuack();

    }

}
