package backend.command;

import backend.StringPair;

public class GreaterThan extends BinaryBooleanOperation{

	public GreaterThan(StringPair stringPair, Command parent) {
		super(stringPair, parent);
	}


	public Double operate(Double expr1, Double expr2) {
		if(expr1.compareTo(expr2) > 0){
			return (double) 1;
		}
		return (double) 0;
	}

}
