package store;

public class DefaultPricingStrategy implements PricingStrategy{

    private static DefaultPricingStrategy instance = new DefaultPricingStrategy();

    private DefaultPricingStrategy(){}

    public static DefaultPricingStrategy getInstance(){
        if(instance == null){
            synchronized (DefaultPricingStrategy.class) {
                if(instance == null){
                    instance = new DefaultPricingStrategy();
                }
            }
        }
        return instance;
    }

    public double calculatePrice(Item item, double weight) {
        return item.getPrice() * weight;
    }
}
