/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.addCake(new ChocolateCake());
        order.addCake(new SayingCake(new VanillaCake(), "PLAIN!"));
        order.addCake(new SayingCake(new SprinklesCake(new VanillaCake()), "FANCY!"));
        order.addCake(new SayingCake(
                new SayingCake(
                        new SprinklesCake(
                                new SprinklesCake(
                                        new MultiLayeredCake(new StrawberryCake())
                                )
                        )
                ),
                "One of"
        ));

        order.addCake(new SayingCake(
                new SayingCake(
                        new SprinklesCake(
                                new SprinklesCake(
                                        new MultiLayeredCake(new StrawberryCake())
                                )
                        )
                ),
                "EVERYTHING"
        ));

        order.printOrder();
    }
}
