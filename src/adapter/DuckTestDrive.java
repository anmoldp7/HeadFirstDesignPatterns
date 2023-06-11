package adapter;

public class DuckTestDrive {
    public static void main(String[] args) throws Exception {
        Duck mallardDuck = new MallardDuck();

        Turkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("Turkey says:");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("Duck says:");
        testDuck(mallardDuck);

        System.out.println("Turkey adapter says:");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
