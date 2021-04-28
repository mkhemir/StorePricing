package store;


public class SecondItemReductionStrategy implements PricingStrategy {

    private static SecondItemReductionStrategy instance = new SecondItemReductionStrategy();

    private SecondItemReductionStrategy(){}

    public static SecondItemReductionStrategy getInstance(){
        if(instance == null){
            synchronized (SecondItemReductionStrategy.class) {
                if(instance == null){
                    instance = new SecondItemReductionStrategy();
                }
            }
        }
        return instance;
    }

    // second item with half price
    public double calculatePrice(Item item, double num) {
        return item.getPrice() * num - (item.getPrice() * (num % 2) * 0.5);
    }
}
