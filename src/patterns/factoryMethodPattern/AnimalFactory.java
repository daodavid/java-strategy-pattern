package patterns.factoryMethodPattern;

public class AnimalFactory {
	private final static String namePackage = "patterns.factoryMethodPattern";

	public static Animal getAnimal(String name) {
		try {
			
				return (Animal) Class.forName(namePackage + "."+name).newInstance();
			

    	   } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			System.err.println("doesn't exist class :" + name);
    	   }
    	   return null;
       }
}
