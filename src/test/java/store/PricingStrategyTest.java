package store;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PricingStrategyTest {

	public Item item;


	@Before
	public void before() {
		this.item = new Item();
		this.item.setId(1);
		this.item.setPrice(10);

	}

	@Test
	public void testDefaultStrategy() {
		Context context = new Context(DefaultPricingStrategy.getInstance());
		assertSame(context.executeStrategy(this.item, 3), 30);
	}

	@Test
	public void testBuyTwoGetOenStrategy() {
		Context context = new Context(BuyTwoGetOneStategy.getInstance());
		assertSame(context.executeStrategy(this.item, 7), 50);
	}

	@Test
	public void testSecondItemReductionStrategy() {
		Context context = new Context(SecondItemReductionStrategy.getInstance());
		assertSame(context.executeStrategy(this.item, 5), 40);
	}
}
