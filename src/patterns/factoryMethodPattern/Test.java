package patterns.factoryMethodPattern;

public class Test {
       public static void main(String[] args) {
		Animal a=AnimalFactory.getAnimal("Daog");
		System.out.println(a.getClassName());
		System.out.println(a.speed());
	}
}
