package adapterPattern;

public class BugattiVeyron implements Movable {
	@Override
	public double getSpeed() {
		return 268;
	}

	@Override
	public double getCost() {
		return 20;
	}
}