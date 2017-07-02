package strategyPattern;

public class OperationMultiply implements Strategy {

	@Override
	public int doOperation(int a, int b) {
		// TODO Auto-generated method stub
		return b*a;
	}

}
