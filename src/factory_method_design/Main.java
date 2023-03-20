package Factory_Method_Design;

public class Main {
	public static void main(String[] args) {
		Calculator basicCalculator = Calculator_Factory.createCalculator("basic");
		Calculator scientificCalculator = Calculator_Factory.createCalculator("scientific");
		Calculator programmerCalculator = Calculator_Factory.createCalculator("programmer");
		
		System.out.println(basicCalculator.add(8, 8));
		System.out.println(scientificCalculator.multiply(4,8));
		System.out.println(programmerCalculator.divide(12, 3));
	}

}
