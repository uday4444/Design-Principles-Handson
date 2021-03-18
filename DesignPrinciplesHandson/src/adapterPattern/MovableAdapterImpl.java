package adapterPattern;

public class MovableAdapterImpl implements MovableAdapter {

	private Movable luxuryCars;

	public MovableAdapterImpl(Movable bugattiVeyron) {
		this.luxuryCars = bugattiVeyron;
	}

	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}

	@Override
	public double getCost() {

		return convertUSDToEuro(luxuryCars.getCost());
	}
	
	private double convertUSDToEuro(double cost)
	{
		return cost * 0.84;
	}

}
