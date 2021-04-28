package store;

public class BuyTwoGetOneStategy implements PricingStrategy{

    private static BuyTwoGetOneStategy instance = new BuyTwoGetOneStategy();

    private BuyTwoGetOneStategy(){}

    public static BuyTwoGetOneStategy getInstance(){
        if(instance == null){
            synchronized (BuyTwoGetOneStategy.class) {
                if(instance == null){
                    instance = new BuyTwoGetOneStategy();
                }
            }
        }
        return instance;
    }
    public double calculatePrice(Item item, double num) {
        return (num - num % 2) * item.getPrice();
    }
}
