package abstractFactoryPattern;

public abstract class HeadLight {

	private String headlightModel;

	public HeadLight(String headlightModel) {
		super();
		this.headlightModel = headlightModel;
	}

	public String getHeadlightModel() {
		return headlightModel;
	}

}
