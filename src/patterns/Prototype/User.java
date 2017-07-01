package patterns.Prototype;

public class User implements Cloneable {
   private String name;
   public User(String name){
	   this.name=name;
   }
public User getPrototy(){
	return new User(this.name);
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
}
