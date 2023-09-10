public class DuckFactory extends AbstractDuckFactory{

    @Override
    public Quackable createDuck() {
        return new Duck();
    }

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {

        return new RedheadDuck();
    }

    @Override
    public Quackable createRubberDuck() {

        return new RubberDuck();
    }
}