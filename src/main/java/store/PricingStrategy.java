package store;

public interface PricingStrategy {

	double calculatePrice(Item item, double num);
}
