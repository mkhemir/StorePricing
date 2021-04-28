package store;

public class Context {

    private PricingStrategy strategy;

    public Context(PricingStrategy strategy){
        this.strategy = strategy;
    }

    public double executeStrategy(Item item, int num){
        return strategy.calculatePrice(item, num);
    }
}
