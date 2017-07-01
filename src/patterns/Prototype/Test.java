package patterns.Prototype;

public class Test {
   public static void main(String[] args) {
	User user=new User("Pencho");
	User p=user.getPrototy();
	System.out.println(p.getName());
	User l=p;
	User c=(User) p.clone();
	System.out.println(c.getName());
	
   }
}