package strategyPattern;

public class Context {
  private Strategy strtegy;
  
    public Context(Strategy st){
    	this.strtegy=st;
    }
    public int operation(int a,int b){
    	return  this.strtegy.doOperation(a, b);
    }
}
