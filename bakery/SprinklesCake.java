public class SprinklesCake extends CakeDecorator {
    public SprinklesCake(Cake cake) {
        super(cake);
    }

    @Override
    public int getCost() {
        return cake.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with sprinkles";
    }
}
