package patterns.factoryMethodPattern;

public abstract class Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
    //that abstact method return spesiphic speed for every animal
	public abstract double speed();
	
	public String getClassName(){
		return  this.getClass().getName();
	}
} 
