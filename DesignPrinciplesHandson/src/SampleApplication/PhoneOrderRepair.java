package SampleApplication;

public class PhoneOrderRepair implements IOrderRepair {

	@Override
	public void processOrder(String modelName) {

		System.out.println("Order Accepted " + modelName);
	}

	@Override
	public void processPhoneRepair(String modelName) {

		System.out.println("Repair Accepted " + modelName);
	}

	@Override
	public void processAccessoryRepair(String accessoryType) {

		System.out.println("Repair Accepted " + accessoryType);

	}

}
