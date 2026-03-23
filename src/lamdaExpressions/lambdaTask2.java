package lamdaExpressions;

import java.util.function.DoubleSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.UnaryOperator;

public class lambdaTask2 {

	public static void main(String[] args) {
		
		DoubleSupplier ds = () -> {return 0;};
		LongToDoubleFunction ltdf = Long -> {return 0;};
		UnaryOperator<String> up = String -> {return String;};
		

	}

}         
