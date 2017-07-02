package strategyPattern;

public class Test {
  public static void main(String[] args) {
	//added
	  Context c=new Context(new OperationAdd());
	  System.out.println(c.operation(2, 4));
	   c=new Context(new OperationSubstract());
	  System.out.println(c.operation(2, 4));
}
}
