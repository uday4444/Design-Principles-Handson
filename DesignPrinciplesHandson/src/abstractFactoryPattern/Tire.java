package abstractFactoryPattern;

public abstract class Tire {

	private String tireModel;

	public Tire(String tireModel) {
		super();
		this.tireModel = tireModel;
	}

	public String getTireModel() {
		return tireModel;
	}

}
