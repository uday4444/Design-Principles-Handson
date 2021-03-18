package adapterPattern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class adapterTest {

	@Test
	public void whenConvertingMPHToKMPH_thenSuccesfullyConverted()
	{
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312,0.00001);
	}
	
	
	//Test converting 20USD to Euros.
	@Test
	public void whenConvertingUSDToEuro_thenSuccesfullyConverted()
	{
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		assertEquals(bugattiVeyronAdapter.getCost(),16.8,0.00001);
	}

}
