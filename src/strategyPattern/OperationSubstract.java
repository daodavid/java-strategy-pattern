package strategyPattern;

public class OperationSubstract implements Strategy{

	@Override
	public int doOperation(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

}
