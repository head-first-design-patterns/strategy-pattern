public class DuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("\n");

        RubberDuck rubberDuck = new RubberDuck();

        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        System.out.println("\nAttaching rocket to rubber duck \n");

        rubberDuck.setFlyBehavior(new FlyRocketPowered());
        rubberDuck.display();
        rubberDuck.performFly();
    }
}
