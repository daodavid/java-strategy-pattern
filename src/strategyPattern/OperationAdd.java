package strategyPattern;

public class OperationAdd implements Strategy {

	@Override
	public int doOperation(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
