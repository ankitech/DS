package dijkstraInterpretor;

public class App {

	public static void main(String[] args) {
		
		Algorithm algorithm =  new Algorithm();
		
		String expression = "( ( 1 + 2 ) * ( 3 * 4 ) )";
		
		algorithm.interpretExpression(expression);
		
		System.out.println("result of expression  "+expression+" is : "+algorithm.result());

	}

}
