package abstractFactoryPattern;

import java.util.Scanner;

public class Client {
	
	public static void getFactoryModel(String factoryName)
	{
		Tire tire = FactoryMaker.getFactory(factoryName).makeTire();
		System.out.println("The tire Model for " + factoryName + " is " + tire.getTireModel());
		
		HeadLight headLight = FactoryMaker.getFactory(factoryName).makeHeadLight();
		System.out.println("The Head light model for " + factoryName + " is " + headLight.getHeadlightModel());
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the Car factory name");
		Scanner sc = new Scanner(System.in);
		
		String factoryName = sc.nextLine();
		Client.getFactoryModel(factoryName);
		
	}

}
