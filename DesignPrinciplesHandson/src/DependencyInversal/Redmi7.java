package DependencyInversal;

public class Redmi7 implements IPhone {

	@Override
	public String getPhonePart1() {
		return "Display";
	}

	@Override
	public double getPart1Cost() {
		return 500;
	}

}
