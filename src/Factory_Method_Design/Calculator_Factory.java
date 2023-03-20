package Factory_Method_Design;

public class Calculator_Factory {
	
	public static Calculator createCalculator( String calcType) {
		switch (calcType) {
		case "basic": {
			 return new Basic_Calculator();
		}
		case "scientific": {
			return new Scientific_Calculator();
		}
		case "programmer": {
			return new Programmer_Calculator();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + calcType);
		}
		// TODO Auto-generated constructor stub
	}

}
