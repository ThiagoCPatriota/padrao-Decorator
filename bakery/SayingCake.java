public class SayingCake extends CakeDecorator {
    private final String saying;

    public SayingCake(Cake cake, String saying) {
        super(cake);
        this.saying = saying;
    }

    @Override
    public int getCost() {
        return cake.getCost();
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with saying \"" + saying + "\"";
    }
}
