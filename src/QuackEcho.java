public class QuackEcho implements Quackable{

    Quackable duck;

    public QuackEcho(Quackable duck){
        this.duck = duck;
    }

    private void echo(String m){
        System.out.println("Echo : "+m);
    }

    @Override
    public void quack() {
        duck.quack();
        echo("quack");
    }
}
