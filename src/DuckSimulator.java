public class DuckSimulator {
    public static void main(String[] args) {

        // ส่วนที่ 1
//        System.out.println("part 1 ...");
//
//        Quackable mallardDuck = new QuackCounter(new MallardDuck());
//        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
//        Quackable rubberDuck = new QuackCounter(new RubberDuck());
//        Quackable duck = new QuackCounter(new Duck());
//        Quackable goose = new GooseAdapter(new Goose());
//        Quackable pigeon = new PigeonAdapter(new Pigeon());
//
//        mallardDuck.quack();
//        redheadDuck.quack();
//        rubberDuck.quack();
//
//        duck.quack();
//        goose.quack();
//        pigeon.quack();
//
//        System.out.println("Quack count : " + QuackCounter.getQuackCount()); // ans 4
//
//        System.out.println("---------------------------------------------------------------");

        // ส่วนที่ 2
//        System.out.println("part 2 ...");

//        Quackable duckEcho = new QuackEcho(new QuackCounter(new Duck()));
//        Quackable duckCounter = new QuackCounter(new QuackEcho(new Duck()));
//
//        duckEcho.quack();
//        duckCounter.quack();
//
//        System.out.println("Quack count : " + QuackCounter.getQuackCount()); // ans 2
//
//        System.out.println("---------------------------------------------------------------");


        // ส่วนที่ 3
//        System.out.println("part 3 ...");
//
//        AbstractDuckFactory duckFactory = new DuckFactory();
//        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
//        AbstractDuckFactory echoAndCountingDuckFactory = new EchoAndCountingDuckFactory();
//
//        Quackable duck =  duckFactory.createDuck();
//        Quackable mallardDuck = countingDuckFactory.createMallardDuck();
//        Quackable redheadDuck = echoAndCountingDuckFactory.createRedheadDuck();
//
//        duck.quack();
//        mallardDuck.quack();
//        redheadDuck.quack();
//
//        System.out.println("Quack count : " + QuackCounter.getQuackCount()); // ans 2
//
//        System.out.println("---------------------------------------------------------------");


        // ส่วนที่ 4
        System.out.println("part 4 ...");

        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        Quackable duck = duckFactory.createDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(duck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(goose);

        Flock flockOfMallards = new Flock();

        Quackable mallard1 = duckFactory.createMallardDuck();
        Quackable mallard2 = duckFactory.createMallardDuck();
        Quackable mallard3 = duckFactory.createMallardDuck();
        Quackable mallard4 = duckFactory.createMallardDuck();

        flockOfMallards.add(mallard1);
        flockOfMallards.add(mallard2);
        flockOfMallards.add(mallard3);
        flockOfMallards.add(mallard4);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        flockOfDucks.quack();

        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        flockOfMallards.quack();
        System.out.println("Quack count : " + QuackCounter.getQuackCount());

        System.out.println("---------------------------------------------------------------");

    }
}
