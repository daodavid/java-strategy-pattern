package patterns.Prototype;

public class User  {
   private String name;
   public User(String name){
	   this.name=name;
   }
   //firstway
public User getPrototy(){
	return new User(this.name);
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
//second way
public User clone()  {
	// TODO Auto-generated method stub
	try {
		return (User) super.clone();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}

}
